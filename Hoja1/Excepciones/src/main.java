import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		Scanner teclado=new Scanner(System.in);
		int[] prueba = new int[2];
		System.out.println("Introduce un número");
		x=teclado.nextDouble();
		System.out.println("Introduce un número");
		y=teclado.nextDouble();
		try{
			System.out.println("El resultado de la división de "+x+" y "+y+" es: "+ division.divisionReal(x, y));
			prueba[3]=8;
		}catch(IndexOutOfBoundsException cero){
			System.out.println("Array problema");
			System.out.println(cero.toString());
		}
		catch(Exception patata){
			System.out.println("Has intentado dividir por 0");
			System.out.println(patata.toString());

		}
	}

}
