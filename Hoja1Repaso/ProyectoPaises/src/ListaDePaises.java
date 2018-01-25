
public class ListaDePaises {
	String[] paises;
	int numElementos = 0;
	int maxElementos;

	ListaDePaises(int numeroMaximo) {
		paises = new String[numeroMaximo];
	}

	public Boolean anyadir(String nombre) {
		if (estaLlena()) {
			return false;
		} else {
			paises[numElementos] = nombre;
			numElementos++;
			return true;
		}
	}

	public Boolean borrar(String nombre) {
		Integer pos = posicion(nombre);
		if (pos == null) {
			return false;
		} else {
			
			// End it
			return true;
		}

		// Placeholded
	}

	public void vaciarLista() {
		for (int i = 0; i < maxElementos; i++) {
			paises[i] = null;
		}
	}

	public String mostrar(int posicion) {
		if (paises[posicion] == null) {
			return null;
		} else {
			return paises[posicion];
		}
	}

	public Integer numElementos() {
		return numElementos;
	}

	public Integer maxElementos() {
		return maxElementos;
	}

	public Boolean estaLlena() {
		if (numElementos == maxElementos)
			return true;
		else
			return false;
	}

	public Integer posicion(String nombre) {
		for (int i = 0; i < maxElementos; i++) {
			if (nombre.equals(paises[i])) {
				return i;
			}
		}
		return null;
	}
}
