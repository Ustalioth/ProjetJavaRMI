package TicTacToe;
import java.rmi.*;

public interface Interface {
		public void determinerCase(int posX, int posY) throws RemoteException;
		public char getCurrentSymbol() throws RemoteException;
		public void setCurrentSymbol(char currentSymbol) throws RemoteException;
		public Case[][] getGrille() throws RemoteException;
		public void setGrille(Case[][] grille) throws RemoteException;
		public int returnY(int y) throws RemoteException;
		public int returnX(int x) throws RemoteException;
	
}
