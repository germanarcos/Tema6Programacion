/**
 * 
 * @author Germán Arcos
 *
 */
public class CuentaCorriente {
	/**
	 * @author Germán Arcos
	 */
	private String numCuenta;
	private double saldo;
	private static String ultimaCuenta = "0";
	private static int cuentasActivas;
	private String cliente;

	/**
	 * 
	 * @param cuenta
	 * @param cantidad
	 */
	public CuentaCorriente(String cuenta, String cliente, double cantidad) {
		numCuenta = cuenta;
		this.cliente = cliente;
		saldo = cantidad;
		cuentasActivas++;
	}

	public void ingresaEfectivo(double cantidad) {
		saldo += cantidad;
	}

	public static int getCuentasActivas() {
		return cuentasActivas;
	}

	/**
	 * 
	 * @param cantidad
	 * @return Devuelve un booleano, verdadero si ha conseguido realizar la
	 *         operación, falso si no, si consigue realizarla hace el cálculo
	 */
	public boolean retirarEfectivo(double cantidad) {
		if (saldo >= cantidad) {
			saldo -= cantidad;
			return true;
		} else {
			return false;
		}
	}

	public void cerrarCuenta() {
		this.cliente += "CERRADA";
		this.saldo = 0;
		cuentasActivas--;
	}

	public void visualiza() {
		System.out.println("El número de cuenta es: " + numCuenta);
		System.out.println("El saldo es:" + saldo);
	}

	public static CuentaCorriente fusiona(CuentaCorriente cuenta1, CuentaCorriente cuenta2) {
		if (cuenta1.cliente.equals(cuenta2.cliente)) {
			if (!cuenta1.numCuenta.equals(cuenta2.numCuenta)) {
				int numero = Integer.parseInt(ultimaCuenta);
				numero += 1;
				ultimaCuenta = Integer.toString(numero);
				CuentaCorriente nueva = new CuentaCorriente(ultimaCuenta, cuenta1.cliente,
						cuenta1.saldo + cuenta2.saldo);
				cuenta1.cerrarCuenta();
				cuenta2.cerrarCuenta();
				return nueva;
			}
		}
		return null;
	}
}
