package TicTacToe;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;
import graphique.*;

import graphique.controleurGrille;

public class Client {
	
	
	public static void main(String[] args) throws InterruptedException {
		
			int port = 8000;
			
			Case[][] startGrid = new Case[3][3];
			gameData jeu = new gameData('O', startGrid);
			
			int end = 0;
			
			Scanner sc = new Scanner(System.in);
			
			while(1 == 1) {
				
				int x = 3;
				int	y = 3;
				
				int posX = 0;
			    int posY = 0;
				
				//while(x < 0 || x > 2 || y < 0 || y > 2){
					//System.out.println("Choisis une case où placer ton " + jeu.getCurrentSymbol() + " x puis y (max 3)");
					
					controleurGrille g = new controleurGrille();
					
					g.getGrille().addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
					    posX = e.getX();
					    posY = e.getY();
					});
					
					jeu.determinerCase(posX, posY);
					
					
	//				x = sc.nextInt()-1;
	//				y = sc.nextInt()-1;
	//				
	//				
	//				System.out.println(x);
	//				System.out.println(y);
					
					jeu.getGrille()[x][y].setChecked(true);
					jeu.getGrille()[x][y].setSymbol(jeu.getCurrentSymbol());
					g.afficherSymbole(jeu.getCurrentSymbol(),jeu.getX(),jeu.getY());
					
									
				//}
				
				
				
				//Vérification de fin de partie horizontale
				if(x == 1 && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x+1][y].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x-1][y].getSymbol()
					|| x == 0 && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x+1][y].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x+2][y].getSymbol() 
					|| x == 2 && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x-1][y].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x-2][y].getSymbol()){
					System.out.println(jeu.getGrille()[x][y].getSymbol() + " a gagné !"); 
					System.exit(0); //Fin du programme
				}
				
				//Vérification de fin de partie verticale
				if(jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x][y+1].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x][y-1].getSymbol()
						|| jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x][y+1].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x][y+2].getSymbol() 
						|| jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x][y-1].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x][y-1].getSymbol()){
						System.out.println(jeu.getGrille()[x][y].getSymbol() + " a gagné !");
						System.exit(0); // Fin du programme
					}
				
				//Vérification de fin de partie en diagonale
				if(jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x-1][y-1].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x+1][y+1].getSymbol()
						|| jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x+1][y-1].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x-1][y+1].getSymbol() 
						|| jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x+1][y-1].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x+2][y-2].getSymbol()
						|| jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x-1][y+1].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x-22][y+2].getSymbol()
						|| jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x+1][y+1].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x+2][y+2].getSymbol()
						|| jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x-1][y-1].getSymbol() && jeu.getGrille()[x][y].getSymbol() == jeu.getGrille()[x-2][y-2].getSymbol()){
						System.out.println(jeu.getGrille()[x][y].getSymbol() + " a gagné !");
						System.exit(0); // Fin du programme
					}
				
				if(jeu.getCurrentSymbol() == 'O')
					jeu.setCurrentSymbol('X');
				else
					jeu.setCurrentSymbol('O');
				
			}
					
		}

}
