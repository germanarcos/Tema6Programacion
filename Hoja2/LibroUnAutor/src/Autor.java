
public class Autor {
	private String nombre;
	private String email;
	private char genero;

	Autor(String nombre, String email, char genero) {
		this.nombre = nombre;
		this.email = email;
		this.genero = genero;
		generoCorrecto();
	}

	private void generoCorrecto() {
		while (genero != 'm' && genero != 'f') {
			genero = Leer.pedirCadena("Introduce un género correcto por favor").charAt(0);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String cadenaAutor() {
		String cadena = "Autor[nombre = " + nombre + ", email = " + email + ", genero" + " = " + genero;
		return cadena;
	}

}
