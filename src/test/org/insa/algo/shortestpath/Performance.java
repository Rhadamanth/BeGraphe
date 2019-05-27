package org.insa.algo.shortestpath;

import org.junit.Test;
import java.util.concurrent.TimeUnit;

public class Performance {
	@Test
	public void Compare() throws Exception {
		
		System.out.println("#####----- Test de validité sans oracle sur une carte-----######");
		
		
		System.out.println("#####----- Carte : CARRE DENSE ---------------------------######");
		System.out.println();
		System.out.println("----- Cas d'un chemin simple ------");
		int origine;
		int destination;
		origine = 0;
		destination = 20000;
		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/carre-dense.mapgr";
		
		DijkstraTestWithMap testD = new  DijkstraTestWithMap();
		long startTime = System.nanoTime();
		testD.testScenarioSansOracle(mapName,origine,destination);    
		long endTime = System.nanoTime();
		long timeElapsedD = endTime - startTime;
	    System.out.println("Execution time in nanoseconds  Dijkstra : " + timeElapsedD);
	    System.out.println("Execution time in milliseconds Dijkstra : " + timeElapsedD / 1000000);
		
		AStarTestWithMap testA = new  AStarTestWithMap();
		startTime = System.nanoTime();
		testA.testScenarioSansOracle(mapName,origine,destination);
		endTime = System.nanoTime();
		long timeElapsedA = endTime - startTime;
	    System.out.println("Execution time in nanoseconds  AStar : " + timeElapsedA);
	    System.out.println("Execution time in milliseconds AStar : " + timeElapsedA / 1000000);
	    System.out.println();
	    System.out.println("AStar is " + ((float)timeElapsedD/(float)timeElapsedA-1)*100 + "% faster than Dijkstra");
	    
	    
	    
	    System.out.println("#####----- Carte : GHADELOUPE ---------------------------######");
		System.out.println();
		System.out.println("----- Cas d'un chemin simple ------");
		origine = 9922;
		destination = 30000;
		mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/guadeloupe.mapgr";
		
		float moyenne=0;
		for(int i =0;i<2;i++) {
			testD = new  DijkstraTestWithMap();
			startTime = System.nanoTime();
			testD.testScenarioSansOracle(mapName,origine,destination);    
			endTime = System.nanoTime();
			timeElapsedD = endTime - startTime;
			System.out.println("Execution time in milliseconds Dijkstra : " + timeElapsedD / 1000000);
			testA = new  AStarTestWithMap();
			startTime = System.nanoTime();
			testA.testScenarioSansOracle(mapName,origine,destination);
			endTime = System.nanoTime();
			timeElapsedA = endTime - startTime;
			System.out.println("Execution time in milliseconds AStar : " + timeElapsedA / 1000000);
		    moyenne += ((float)timeElapsedD/(float)timeElapsedA*100-1);
		}
		System.out.println("AStar is " + moyenne/2 + "% faster than Dijkstra");
	}
	 
}
