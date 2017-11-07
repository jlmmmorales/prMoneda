package prMoneda;

import java.util.Random;

public class Moneda {
	private Random rnd;
	
	public Moneda(){
		rnd = new Random();
	}
	
	public String lanzar() {
		String resultado = "cruz";
		
		float valor = rnd.nextFloat();
		if(valor>0.5){
			resultado = "cara";
		}
		return resultado;
	}
	
	

}
