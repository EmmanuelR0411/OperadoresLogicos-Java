
public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Operadores Logicos Java
		 * a == b a es igual a b
		 * a > b a es mayor que b
		 * a < b a es menor que b
		 * a != b a es diferente de b
		 * >= <=
		 *
		 * Operadores logicos
		 * !
		 * |
		 * &
		 * || si una de las dos condiciones no se cumple las dos las toma como 
		 * false
		 * && si una de las dos condiciones no se cumple las dos las toma como 
		 * false
		 */
		
		
		saludo();
		System.out.println(saludo());

	}
	
//	Estatico significa que se puede instanciar el metodo sin crear un objeto
	public static String saludo() {
		
		System.out.println("Saludo 1");
		
		System.out.println("Saludo 2");
		
		return "saludo";
	}

}
