import java.util.Scanner;


public class Shipping {

	
	
	
	/*
	 * Calcular el shipping
	 */
	public double CalcShipping(String ItemType, double price){
		
		double shipping = 0;
		String items;
		item = ItemType.toLowerCase();

		
		if(item.equals("libro") || item.equals("libro ") || item.equals(" libro") || item.equals(" libro ")){
			
			return shipping = 0.0;
			
		}
		else if(price > 100){
			return shipping = 5.0; 
		}
		else{
			
			shipping = (price*0.05);
			return shipping;
			
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String articulo;
		double precio = 0.0;
		Shipping a = new Shipping();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca los datos para calcular el Shipping: ");
		System.out.println("Articulo: " );
		articulo = scan.nextLine();
		System.out.println("Precio: " );
		precio = scan.nextDouble();
		
		scan.close();
		
		System.out.println("El monto del shipping es: " + a.CalcShipping(articulo, precio));
		
	

	}

}
