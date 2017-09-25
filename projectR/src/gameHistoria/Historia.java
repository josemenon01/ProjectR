package gameHistoria;

public class Historia {
	static int momentoDaHistoria = 0;

	public String PassarHistoria(){
		
		switch(momentoDaHistoria) {

		case 0:
			return "parte 1";
		case 1:
			return "parte 2";
		default:
			return "erro";
		
	}
	
	}
	public String Evento() {
		
		
		return null;
		
	}
}
