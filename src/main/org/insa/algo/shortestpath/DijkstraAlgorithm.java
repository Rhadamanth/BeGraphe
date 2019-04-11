package org.insa.algo.shortestpath;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.insa.algo.AbstractSolution.Status;
import org.insa.algo.utils.*;
import org.insa.graph.*;

public class DijkstraAlgorithm extends ShortestPathAlgorithm {

    public DijkstraAlgorithm(ShortestPathData data) {
        super(data);
        this.nbSommetsVisites = 0;
    }
    
    protected int nbSommetsVisites;
	protected int nbSommets;
	
	/* Crée et retourne le Label correspondant au Node */
	protected Label newLabel(Node node, ShortestPathData data) {
		return new Label(node);
	}
	
    @Override
    protected ShortestPathSolution doRun() {
    	boolean fin = false;
		ShortestPathData data = getInputData();
		Graph graph = data.getGraph();
		int tailleGraphe = graph.size();

		ShortestPathSolution solution = null;

		Label tabLabels[] = new Label [tailleGraphe];

		BinaryHeap<Label> tas = new BinaryHeap<Label>();

		Arc[] predecessorArcs = new Arc[tailleGraphe];

		Label deb = newLabel(data.getOrigin(), data);
		tabLabels[deb.getNode().getId()] = deb;
		tas.insert(deb);
		deb.setInTas();
		deb.setCost(0);
		
		notifyOriginProcessed(data.getOrigin());

		while(!tas.isEmpty() && !fin){ 
			Label current= tas.deleteMin();
			current.setMark();
			/* On a atteint la destination */
			if (current.getNode() == data.getDestination()) {
				fin = true;
			}
			/* Parcours des successeurs du sommet courant */
			Iterator<Arc> arc = current.getNode().iterator();
			while (arc.hasNext()) {
				Arc arcIter = arc.next();

				/* On vérifie que l'on peut réellement prendre cet arc */
				if (!data.isAllowed(arcIter)) {
					continue;
				}

				Node successeur = arcIter.getDestination();

				/* On recupere le label correspondant au noeud dans le tableau de labels */
				Label successeurLabel = tabLabels[successeur.getId()];
				
				if (successeurLabel == null) {
					successeurLabel = newLabel(successeur, data);
					tabLabels[successeurLabel.getNode().getId()] = successeurLabel;
					/* On incrémente le nombre de sommets visités pour le test de performance */
					this.nbSommetsVisites++;
				}
				
				if (!successeurLabel.getMark()) {
					/* Si on obtient un meilleur coût */
					if((successeurLabel.getTotalCost()>(current.getCost()+data.getCost(arcIter)
						+(successeurLabel.getTotalCost()-successeurLabel.getCost()))) 
						|| (successeurLabel.getCost()==Float.POSITIVE_INFINITY)){
						successeurLabel.setCost(current.getCost()+(float)data.getCost(arcIter));
						successeurLabel.setFather(current.getNode());
						if(successeurLabel.getInTas()) {
							tas.remove(successeurLabel);
						}
						else {
							successeurLabel.setInTas();
						}
						tas.insert(successeurLabel);
						predecessorArcs[arcIter.getDestination().getId()] = arcIter;
					}
				}
			}
		
		}
		/* Il n'y a pas de solution */
		if (predecessorArcs[data.getDestination().getId()] == null) {
			solution = new ShortestPathSolution(data, Status.INFEASIBLE);
		} else {
			/* Création du Path avec l'array predecessor*/
			ArrayList<Arc> arcs = new ArrayList<>();
			Arc arc = predecessorArcs[data.getDestination().getId()];

			while (arc != null) {
				arcs.add(arc);
				arc = predecessorArcs[arc.getOrigin().getId()];
			}

			/* Inversion du Path */
			Collections.reverse(arcs);

			/* Solution finale */
			solution = new ShortestPathSolution(data, Status.OPTIMAL, new Path(graph, arcs));
		}	
        return solution;
    }

}
