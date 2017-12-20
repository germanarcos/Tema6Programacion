import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el color del tragabolas.");
		String color = teclado.next();
		while(!color.equalsIgnoreCase("verde") && 
				!color.equalsIgnoreCase("rojo")&& !color.equalsIgnoreCase("amarillo") ){
			System.out.println("El color solo puede ser verde, rojo o amarillo.");
			color = teclado.next();
		}
		System.out.println("Introduce el máximo de bolas que pueda comer");
		int bolas = teclado.nextInt();
		while(bolas<=0){
			System.out.println("Introduce un número de bolas mayor que 0.");
			bolas = teclado.nextInt();
		}
		TragaBolas tragabolas = new TragaBolas();
		do{
			System.out.println("1: Crear tragabolas.");
			System.out.println("2: Darle de comer.");
			System.out.println("3: Hacerle dormir.");
			System.out.println("4: Hacerle trotar.");
			System.out.println("5: Ver estado.");
			System.out.println("0: Fin.");
			opcion = teclado.nextInt();
			switch (opcion){
			case 1:
				tragabolas.TragaBolas(color, bolas);
				break;
			case 2:
				tragabolas.comer();
				break;
			case 3:
				tragabolas.dormir();
				break;
			case 4:
				tragabolas.trotar();
				break;
			case 5:
				tragabolas.visualizar();
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("No has introducido un número correcto.");
				break;
			}
			
		}while(opcion !=0);
	}

}
