package prMoneda;


public class MainMoneda {

	public static void main(String[] args) {
		int veces = 0;
		try{
			veces = Integer.parseInt(args[0]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.err.println("ERROR: MainMoneda necesita un argumento para funcionar.");
		}catch (NumberFormatException e){
			System.err.println("ERROR: MainMoneda necesita un valor entero para funcionar, \""
									+args[0].toString()+"\" no es un entero correcto.");
		}catch (Exception e){
			System.err.println("ERROR: MainMoneda ha tenido un error desconocido.");
		}
		
		Moneda moneda = new Moneda();
		lanzarNVeces(moneda,veces);
	}

	private static void lanzarNVeces(Moneda moneda, int veces) {
		
		for(int i=1; i<=veces; i++){
			System.out.println("Lanzamiento "+i+", ha salido: "+moneda.lanzar());
		}
		
	}

}
