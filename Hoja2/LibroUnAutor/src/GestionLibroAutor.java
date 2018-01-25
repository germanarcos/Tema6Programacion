import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestionLibroAutor {
	static ArrayList<Libro> listadoLibros = new ArrayList<>();
	static ArrayList<Autor> listadoAutores = new ArrayList<>();

	public static void main(String[] args) {
		String nombre;
		// Iterator<Libro> iteradorLibros = listadoLibros.iterator();
		// Iterator<Autor> iteradorAutores = listadoAutores.iterator();
		int opcion, tamano;
		// Libro libro = new Libro();
		// listado.add(libro);
		// Iterator<Libro> iterador = listado.iterator();
		do {
			mostrarMenu();
			opcion = Leer.pedirEntero("");
			switch (opcion) {
			case 1:
				Autor autor = crearAutor();
				crearLibro(autor);
				;
				// listadoLibros.add();
				break;
			case 2:
				nombre = Leer.pedirCadena("¿Qué autor quieres modificar?");
				tamano = listadoAutores.size();
				for (int i = 0; i < tamano; i++) {
					if (nombre.equalsIgnoreCase(listadoAutores.get(i).getNombre())) {
						mostrarMenuAutor();
						switch (Leer.pedirEntero("")) {
						case 1:
							listadoAutores.get(i).setEmail(Leer.pedirCadena("Introduce un email"));
							break;
						case 2:
							listadoAutores.get(i).setGenero(Leer.pedirCadena("Introduce f o m").charAt(0));
							break;
						case 3:
							System.out.println("Cancelando");
							break;
						default:

						}
					}
				}

				break;
			case 3:
				nombre = Leer.pedirCadena("¿Qué libro quieres modificar?");
				tamano = listadoLibros.size();
				for (int i = 0; i < tamano; i++) {
					if (nombre.equalsIgnoreCase(listadoLibros.get(i).getTitulo())) {
						mostrarMenuLibro();
						switch (Leer.pedirEntero("")) {
						case 1:
							listadoLibros.get(i).setCantidad(Leer.pedirEntero("Introduce una cantidad"));
							break;
						case 2:
							listadoLibros.get(i).setPrecio(Leer.pedirDouble("Introduce un precio"));
							break;
						case 3:
							Leer.mostrarEnPantalla("Saliendo...");
							break;
						}
					}
				}
				break;
			case 4:
				tamano = listadoLibros.size();
				for (int i = 0; i < tamano; i++) {
					System.out.println(listadoLibros.get(i).cadenaLibro());
				}
				break;
			case 5:
				tamano = listadoAutores.size();
				for (int i = 0; i < tamano; i++) {
					System.out.println(listadoAutores.get(i).cadenaAutor());
				}
				break;
			case 0:
				Leer.mostrarEnPantalla("Saliendo...");
				break;
			default:
				Leer.mostrarEnPantalla("No se ha introducido una opción correcta");
				break;
			}
		} while (opcion != 0);

	}

	private static Autor crearAutor() {
		String nombre;
		nombre = Leer.pedirCadena("Introduce el autor");
		for (int i = 0; i < listadoAutores.size(); i++) {
			if (listadoAutores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				switch (Leer.pedirEntero("Ya existe el autor " + nombre
						+ "\n¿Quiere usarlo o quiere crearlo de nuevo?\n1- Usarlo" + "\n2- Crearlo de nuevo")) {
				case 1:
					return listadoAutores.get(i);
				case 2:
					Autor autor = new Autor(nombre, Leer.pedirCadena("Introduce el email del autor"),
							Leer.pedirCadena("Introduce el género").charAt(0));
					listadoAutores.add(autor);
					return autor;
				default:
					break;

				}
			}
		}
		Autor autor = new Autor(nombre, Leer.pedirCadena("Introduce el email del autor"),
				Leer.pedirCadena("Introduce el género").charAt(0));
		listadoAutores.add(autor);
		return autor;

	}

	private static Libro crearLibro(Autor autor) {
		Libro libro = new Libro(Leer.pedirCadena("Introduce el título"), autor, Leer.pedirDouble("Introduce el precio"),
				Leer.pedirEntero("Introduce la cantidad"));
		listadoLibros.add(libro);
		return libro;
	}

	public static void mostrarMenu() {
		System.out.println("1- Crear libros.");
		System.out.println("2- Modificar autor.");
		System.out.println("3. Modificar libro.");
		System.out.println("4. Listado de libros.");
		System.out.println("5. Listado de autores.");
		System.out.println("0. Salir.");
	}

	public static void mostrarMenuAutor() {
		System.out.println("1- Modificar email");
		System.out.println("2- Modificar genero");
		System.out.println("3- Salir");
	}

	public static void mostrarMenuLibro() {
		System.out.println("1- Modificar cantidad");
		System.out.println("2- Modificar precio");
		System.out.println("3- Salir");
	}
}
