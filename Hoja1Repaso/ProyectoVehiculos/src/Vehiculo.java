
public class Vehiculo {
	private int numeroDeRuedas;
	private int velocidadMax;
	private int velocidadActual;
	private int peso;

	public int getNumeroDeRuedas() {
		return numeroDeRuedas;
	}

	public void setNumeroDeRuedas(int numeroDeRuedas) {
		this.numeroDeRuedas = numeroDeRuedas;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	Vehiculo(int numeroDeRuedas, int velocidadMax, int velocidadActual, int peso) {
		this.numeroDeRuedas = numeroDeRuedas;
		this.velocidadMax = velocidadMax;
		this.velocidadActual = velocidadActual;
		this.peso = peso;
	}

	public boolean esIgual(Vehiculo vehiculo) {
		if (this.velocidadActual == vehiculo.velocidadActual && this.velocidadMax == vehiculo.velocidadMax
				&& this.peso == vehiculo.peso && this.numeroDeRuedas == vehiculo.numeroDeRuedas) {
			return true;
		} else {
			return false;
		}
	}

	public void copia(Vehiculo vehiculo) {
		this.numeroDeRuedas = vehiculo.numeroDeRuedas;
		this.peso = vehiculo.peso;
		this.velocidadActual = vehiculo.velocidadActual;
		this.velocidadMax = vehiculo.velocidadMax;
	}
}
