package TicTacToe;

public class Case {
	
	private boolean checked;
	private char symbol;	
	
	public Case(boolean checked, char symbol, int x, int y) {
		super();
		this.checked = checked;
		this.symbol = symbol;
	
	}
	
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	
}
