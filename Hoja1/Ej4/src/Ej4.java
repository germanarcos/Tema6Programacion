import java.util.Scanner;
public class Ej4 {
	public static void main(String[] args){
		CuentaCorriente cuenta1 = new CuentaCorriente("001", 0);
		CuentaCorriente cuenta2 = new CuentaCorriente("002", 0);
		int opcion = 0;
		double cantidad;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("1: Ingresar en la cuenta 001");
			System.out.println("2: Ingresar en la cuenta 002");
			System.out.println("3: Retirar de la cuenta 001");
			System.out.println("4: Retirar de la cuenta 002");
			System.out.println("5: Visualizar ambas cuentas");
			System.out.println("0: Fin");
			opcion = teclado.nextInt();
			switch(opcion){
			case 1:
				System.out.println("Introduce una cantidad: ");
				cantidad = teclado.nextDouble();
				cuenta1.ingresaEfectivo(cantidad);
				break;
			case 2:
				System.out.println("Introduce una cantidad: ");
				cantidad = teclado.nextDouble();
				cuenta2.ingresaEfectivo(cantidad);
				break;
			case 3:
				System.out.println("Introduce una cantidad: ");
				cantidad = teclado.nextDouble();
				if(cuenta1.retirarEfectivo(cantidad)==false){
					System.out.println("No se ha podido retirar");
				}else{
					System.out.println("Se ha retirado "+cantidad);
				}
				break;
			case 4:
				System.out.println("Introduce una cantidad: ");
				cantidad = teclado.nextDouble();
				if (cuenta2.retirarEfectivo(cantidad)==false){
					System.out.println("No se ha podido retirar");
				}else{
					System.out.println("Se ha retirado "+cantidad);
				}
				break;
			case 5:
				System.out.println("Cuenta 1:\n");
				cuenta1.visualiza();
				System.out.println("\nCuenta 2:\n");
				cuenta2.visualiza();
				break;
			case 0:
				break;
			}
			System.out.println();
		}while(opcion!=0);
	}
}
