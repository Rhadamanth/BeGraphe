package org.insa.algo.shortestpath;

import org.junit.Test;

public class AStarTest {

	@Test
	public void testDoScenarioDistanceHG() throws Exception {

		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/haute-garonne.mapgr";
		
		AStarTestWithMap test = new  AStarTestWithMap();
		int origine;
		int destination;
		
		System.out.println("#####----- Test de validit� avec oracle sur une carte-----######");
		System.out.println("#####----- Carte : Haute-Garonne -------------------------######");
		System.out.println("#####----- Mode : DISTANCE -------------------------------######");
		System.out.println();
		
		System.out.println("----- Cas d'un chemin nul ------");
		origine = 0 ;
		destination = 0;
		test.testScenario(mapName, 1,origine,destination);    
		
		System.out.println("----- Cas d'un chemin simple ------");
		origine = 38926;
		destination = 59015;
		test.testScenario(mapName, 1,origine,destination);    	
		
		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : N'existe pas ----------");
		System.out.println("----- Destination : Existe ------------");
		origine = -1;
		destination = 59015;
		test.testScenario(mapName, 1,origine,destination);    	

		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : Existe ----------------");
		System.out.println("----- Destination : N'existe pas ------");
		origine = 38926;
		destination = 200000;
		test.testScenario(mapName, 1,origine,destination);    	
		
		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : N'existe pas ----------");
		System.out.println("----- Destination : N'existe pas ------");
		origine = -1;
		destination = 200000;
		test.testScenario(mapName, 1,origine,destination);    	
	}

	
	@Test
	public void testDoScenarioTempsHG() throws Exception {
		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/haute-garonne.mapgr";

		AStarTestWithMap test = new  AStarTestWithMap();
		int origine;
		int destination;
		
		System.out.println("#####----- Test de validit� avec oracle sur une carte-----######");
		System.out.println("#####----- Carte : Haute-Garonne -------------------------######");
		System.out.println("#####----- Mode : TEMPS ----------------------------------######");
		System.out.println();
		
		System.out.println("----- Cas d'un chemin nul ------");
		origine = 0 ;
		destination = 0;
		test.testScenario(mapName, 0,origine,destination);    
		
		System.out.println("----- Cas d'un chemin simple ------");
		origine = 38926;
		destination = 59015;
		test.testScenario(mapName, 0,origine,destination);    	
	
		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : N'existe pas ----------");
		System.out.println("----- Destination : Existe ------------");
		origine = -1;
		destination = 59015;
		test.testScenario(mapName, 0,origine,destination);    	

		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : Existe ----------------");
		System.out.println("----- Destination : N'existe pas ------");
		origine = 38926;
		destination = 200000;
		test.testScenario(mapName, 0,origine,destination);    	
		
		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : N'existe pas ----------");
		System.out.println("----- Destination : N'existe pas ------");
		origine = -1;
		destination = 200000;
		test.testScenario(mapName, 0,origine,destination);    	
	}

	@Test
	public void testDoScenarioDistanceINSA() throws Exception {
		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/insa.mapgr";

		AStarTestWithMap test = new  AStarTestWithMap();
		int origine;
		int destination;
		
		System.out.println("#####----- Test de validit� avec oracle sur une carte-----######");
		System.out.println("#####----- Carte : INSA ----------------------------------######");
		System.out.println("#####----- Mode : DISTANCE -------------------------------######");
		System.out.println();
		
		System.out.println("----- Cas d'un chemin nul ------");
		origine = 300 ;
		destination = 300;
		test.testScenario(mapName, 1,origine,destination);    
		
		System.out.println("----- Cas d'un chemin simple ------");
		origine = 607;
		destination = 857;
		test.testScenario(mapName, 1,origine,destination);    	
	
		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : N'existe pas ----------");
		System.out.println("----- Destination : Existe ------------");
		origine = 2000;
		destination = 857;
		test.testScenario(mapName, 1,origine,destination);    	

		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : Existe ----------------");
		System.out.println("----- Destination : N'existe pas ------");
		origine = 607;
		destination = 200000;
		test.testScenario(mapName, 1,origine,destination);    	
		
		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : N'existe pas ----------");
		System.out.println("----- Destination : N'existe pas ------");
		origine = 2000;
		destination = 2000;
		test.testScenario(mapName, 1,origine,destination);   
	}

	@Test
	public void testDoScenarioTempsINSA() throws Exception {
		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/insa.mapgr";

		AStarTestWithMap test = new  AStarTestWithMap();
		int origine;
		int destination;
		
		System.out.println("#####----- Test de validit� avec oracle sur une carte-----######");
		System.out.println("#####----- Carte : INSA ----------------------------------######");
		System.out.println("#####----- Mode : TEMPS ----------------------------------######");
		System.out.println();
		
		System.out.println("----- Cas d'un chemin nul ------");
		origine = 300 ;
		destination = 300;
		test.testScenario(mapName, 0,origine,destination);    
		
		System.out.println("----- Cas d'un chemin simple ------");
		origine = 607;
		destination = 857;
		test.testScenario(mapName, 0,origine,destination);    	
	
		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : N'existe pas ----------");
		System.out.println("----- Destination : Existe ------------");
		origine = 2000;
		destination = 857;
		test.testScenario(mapName, 0,origine,destination);    	

		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : Existe ----------------");
		System.out.println("----- Destination : N'existe pas ------");
		origine = 607;
		destination = 200000;
		test.testScenario(mapName, 0,origine,destination);    	
		
		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : N'existe pas ----------");
		System.out.println("----- Destination : N'existe pas ------");
		origine = 2000;
		destination = 2000;
		test.testScenario(mapName, 0,origine,destination);   
	}
	
	@Test
	public void testDoScenarioDistanceCarreDense() throws Exception {
		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/carre-dense.mapgr";

		AStarTestWithMap test = new  AStarTestWithMap();
		int origine;
		int destination;
		
		System.out.println("#####----- Test de validit� avec oracle sur une carte-----######");
		System.out.println("#####----- Carte : CARRE DENSE ---------------------------######");
		System.out.println("#####----- Mode : DISTANCE -------------------------------######");
		System.out.println();
		
		System.out.println("----- Cas d'un chemin simple ------");
		origine = 0;
		destination = 204097;
		test.testScenario(mapName, 1,origine,destination);    		
	}

	@Test
	public void testDoScenarioTempsCarreDense() throws Exception {
		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/carre-dense.mapgr";

		AStarTestWithMap test = new  AStarTestWithMap();
		int origine;
		int destination;
		
		System.out.println("#####----- Test de validit� avec oracle sur une carte-----######");
		System.out.println("#####----- Carte : CARRE DENSE ---------------------------######");
		System.out.println("#####----- Mode : TEMPS -------------------------------######");
		System.out.println();

		System.out.println("----- Cas d'un chemin simple ------");
		origine = 0;
		destination = 204097;
		test.testScenario(mapName, 0,origine,destination);    			
	}
	
	
	@Test
	public void testDoScenarioDistanceGuadeloupe() throws Exception {
		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/guadeloupe.mapgr";

		AStarTestWithMap test = new  AStarTestWithMap();
		int origine;
		int destination;
		
		System.out.println("#####----- Test de validit� avec oracle sur une carte-----######");
		System.out.println("#####----- Carte : GUADELOUPE ----------------------------######");
		System.out.println("#####----- Mode : DISTANCE -------------------------------######");
		System.out.println();
	
		System.out.println("----- Cas d'un chemin simple ------");
		origine = 9922;
		destination = 34328;
		test.testScenario(mapName, 1,origine,destination);    	
	
		System.out.println("----- Cas de sommets non connexes ------");
		origine = 9950;
		destination = 15860;
		test.testScenario(mapName, 1,origine,destination);    	

	}
	
	@Test
	public void testDoScenarioTempsGuadeloupe() throws Exception {
		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/guadeloupe.mapgr";

		AStarTestWithMap test = new  AStarTestWithMap();
		int origine;
		int destination;
		
		System.out.println("#####----- Test de validit� avec oracle sur une carte-----######");
		System.out.println("#####----- Carte : GUADELOUPE ----------------------------######");
		System.out.println("#####----- Mode : TEMPS ----------------------------------######");
		System.out.println();
	
		System.out.println("----- Cas d'un chemin simple ------");
		origine = 9922;
		destination = 34328;
		test.testScenario(mapName, 0,origine,destination);    	
	
		System.out.println("----- Cas de sommets non connexes ------");
		origine = 9950;
		destination = 15860;
		test.testScenario(mapName, 0,origine,destination);    	

	}

	@Test
	public void testDoScenarioMinTempsDistHG() throws Exception {
		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/haute-garonne.mapgr";
		
		AStarTestWithMap test = new  AStarTestWithMap();
		int origine;
		int destination;
		
		System.out.println("#####----- Test de validit� sans oracle sur une carte-----######");
		System.out.println("#####----- Carte : Haute-Garonne -------------------------######");
		System.out.println();

		System.out.println("----- Cas d'un chemin nul ------");
		origine = 0 ;
		destination = 0;
		test.testScenarioSansOracle(mapName,origine,destination);   
		
		System.out.println("----- Cas d'un chemin simple ------");
		origine = 38926;
		destination = 59015;
		test.testScenarioSansOracle(mapName,origine,destination);    	
	
		
		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : N'existe pas ----------");
		System.out.println("----- Destination : Existe ------------");
		origine = -1;
		destination = 59015;
		test.testScenarioSansOracle(mapName,origine,destination);   	

		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : Existe ----------------");
		System.out.println("----- Destination : N'existe pas ------");
		origine = 38926;
		destination = 200000;
		test.testScenarioSansOracle(mapName,origine,destination);    	
		
		System.out.println("----- Cas de sommets inexistants ------");
		System.out.println("----- Origine : N'existe pas ----------");
		System.out.println("----- Destination : N'existe pas ------");
		origine = -1;
		destination = 200000; 
		test.testScenarioSansOracle(mapName,origine,destination);   
	}

	@Test
	public void testDoScenarioMinTempsDistCarreDense() throws Exception {
		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/carre-dense.mapgr";
		
		AStarTestWithMap test = new  AStarTestWithMap();
		int origine;
		int destination;
		
		System.out.println("#####----- Test de validit� sans oracle sur une carte-----######");
		System.out.println("#####----- Carte : CARRE DENSE ---------------------------######");
		System.out.println();

		System.out.println("----- Cas d'un chemin simple ------");
		origine = 0;
		destination = 100052;
		test.testScenarioSansOracle(mapName,origine,destination);    
	}
	

	@Test
	public void testDoScenarioMinTempsDistGuadeloupe() throws Exception {
		String mapName = "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/guadeloupe.mapgr";
		
		AStarTestWithMap test = new  AStarTestWithMap();
		int origine;
		int destination;
		
		System.out.println("#####----- Test de validit� avec oracle sur une carte-----######");
		System.out.println("#####----- Carte : GUADELOUPE ----------------------------######");
		System.out.println();
	
		System.out.println("----- Cas d'un chemin simple ------");
		origine = 9922;
		destination = 34328;
		test.testScenarioSansOracle(mapName,origine,destination);    	
	
		System.out.println("----- Cas de sommets non connexes ------");
		origine = 9950;
		destination = 15860;
		test.testScenarioSansOracle(mapName,origine,destination);    

	}
	

}

