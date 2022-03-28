package csia;

public class Handler {
	private GuiH gui;
	private DatabaseH DataH;
	
	
	public Handler() {
		//Start GUI
		gui = new GuiH(1000,800);
		//Start Database Handler
		DataH= new DatabaseH();
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Handler();
		
		
	}

}
