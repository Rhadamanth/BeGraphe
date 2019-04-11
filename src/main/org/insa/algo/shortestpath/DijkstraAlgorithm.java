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
			/* On indique aux observateurs que le Node a été marqué */
			notifyNodeMarked(current.getNode());
			current.setMark();
			/* Quand on a atteint la destination, on s'arrête */
			if (current.getNode() == data.getDestination()) {
				fin = true;
			}
			/* Parcours des successeurs du sommet courant */
			Iterator<Arc> arc = current.getNode().iterator();
		
		}
        return solution;
    }

}
