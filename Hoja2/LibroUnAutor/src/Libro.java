
public class Libro {
	private String titulo;
	private Autor autor;
	private Double precio;
	private int cantidad;

	Libro(String titulo, Autor autor, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	Libro(String titulo, Autor autor, double precio, int cantidad) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = cantidad;

	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public String cadenaLibro() {
		String cadena = "Libro [titulo = " + titulo + "\n" + autor.cadenaAutor() + "\nprecio = " + precio
				+ "\ncantidad = " + cantidad + "]\"";
		return cadena;
	}
}
