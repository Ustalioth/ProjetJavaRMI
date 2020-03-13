package TicTacToe;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
	
	int x,y,port;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
//	LocateRegistry.createRegistry(port);

}
