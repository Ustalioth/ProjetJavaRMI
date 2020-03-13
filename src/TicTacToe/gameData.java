package TicTacToe;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class gameData extends UnicastRemoteObject implements Interface{
	
	private char currentSymbol;
	private Case[][] grille;
	private int x,y;
	
	public gameData(char currentSymbol, Case[][] grille) throws RemoteException {
		super();
		try {
			this.currentSymbol = currentSymbol;
			this.grille = grille;
		}catch (Exception e) {
		     System.out.println("Impossible de joindre le serveur");
		  }

	}
	
	public char getCurrentSymbol() throws RemoteException {
			return currentSymbol;
	}
	public void setCurrentSymbol(char currentSymbol) throws RemoteException {
		this.currentSymbol = currentSymbol;
	}
	public Case[][] getGrille() throws RemoteException {
		return grille;
	}
	public void setGrille(Case[][] grille) throws RemoteException {
		this.grille = grille;
	}
	
	public int returnY(int y) throws RemoteException {
		return y;
	}
	
	public int returnX(int x) throws RemoteException {
		return x;
	}
	
	public void determinerCase(int posX, int posY) throws RemoteException{
		if(posX < 200) {
			this.x = 0;
			if(posY < 200)
				this.y = 0;
			if(posY > 200 && posY < 400)
				this.y = 1;
			if(posY > 400)
				this.y = 2;
		}
		if(posX > 200 && posX < 400) {
			this.x = 1;
			if(posY < 200)
				this.y = 0;
			if(posY > 200 && posY < 400)
				this.y = 1;
			if(posY > 400)
				this.y = 2;
		}
		if(posX > 600) {
			this.x = 2;
			if(posY < 200)
				this.y = 0;
			if(posY > 200 && posY < 400)
				this.y = 1;
			if(posY > 400)
				this.y = 2;
		}
		
	}
		
}
