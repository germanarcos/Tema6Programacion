import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestionLibroAutor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Libro> listadoLibros = new ArrayList<>();
		ArrayList<Autor> listadoAutores = new ArrayList<>();
		Iterator<Libro> iteradorLibros = listadoLibros.iterator();
		Iterator<Autor> iteradorAutores = listadoAutores.iterator();
		int opcion;
		// Libro libro = new Libro();
		// listado.add(libro);
		// Iterator<Libro> iterador = listado.iterator();
		do {
			mostrarMenu();
			opcion = Leer.pedirEntero("");
			switch (opcion){
			case 1:
				Autor autor = new Autor(Leer.pedirCadena("Introduce el autor"),Leer.pedirCadena("Introduce el email del autor") ,Leer.pedirCadena("Introduce el g�nero").charAt(0));
				listadoLibros.add(new Libro(Leer.pedirCadena("Introduce el t�tulo"), autor, Leer.pedirDouble("Introduce el precio"),Leer.pedirEntero("Introduce la cantidad")));
//				listadoLibros.add();
				listadoAutores.add(autor);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("No se ha introducido una opci�n correcta");
				break;
			}
		} while (opcion != 0);

	}

	public static void mostrarMenu() {
		System.out.println("1- Crear libros.");
		System.out.println("2- Modificar autor.");
		System.out.println("3. Modificar libro.");
		System.out.println("4. Listado de libros.");
		System.out.println("5. Listado de autores.");
		System.out.println("0. Salir.");
	}
}
