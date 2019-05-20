package org.insa.algo.shortestpath;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.insa.algo.AbstractSolution.Status;
import org.insa.algo.utils.*;
import org.insa.graph.*;

public class AStarAlgorithm extends DijkstraAlgorithm {
    public AStarAlgorithm(ShortestPathData data) {
        super(data);
    }
	protected LabelStar newLabel(Node node, ShortestPathData data) {
		return new LabelStar(node,data);
	}
}
