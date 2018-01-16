/**
 * 
 * @author Germ�n Arcos
 *
 */
public class CuentaCorriente {
	/**
	 * @author Germ�n Arcos
	 */
	private String numCuenta;
	private double saldo;
	private static String ultimaCuenta="0";
	private static int cuentasActivas;
	private String cliente;
	/**
	 * 
	 * @param cuenta
	 * @param cantidad
	 */
	public CuentaCorriente(String cuenta, String cliente, double cantidad){
		numCuenta=cuenta;
		this.cliente=cliente;
		saldo=cantidad;
	}
	public void ingresaEfectivo (double cantidad){
		saldo+=cantidad;
	}

	public static int getCuentasActivas() {
		return cuentasActivas;
	}

	/**
	 * 
	 * @param cantidad
	 * @return Devuelve un booleano, verdadero si ha conseguido realizar la operaci�n,
	 * falso si no, si consigue realizarla hace el c�lculo
	 */
	public boolean retirarEfectivo (double cantidad){
		if(saldo>=cantidad){
			saldo-=cantidad;
			return true;
		} 
		else{
			return false;
		}
	}

	public void cerrarCuenta(){
		this.cliente+="CERRADA";
		this.saldo=0;
		cuentasActivas--;
	}

	public void visualiza(){
		System.out.println("El n�mero de cuenta es: "+numCuenta);
		System.out.println("El saldo es:" +saldo);
	}
	public static CuentaCorriente fusiona (CuentaCorriente cuenta1, CuentaCorriente cuenta2){
		if(cuenta1.cliente.equals(cuenta2.cliente)){
			if(!cuenta1.numCuenta.equals(cuenta2.numCuenta)){
				int numero = Integer.parseInt(ultimaCuenta);
				numero+=1;
				ultimaCuenta= Integer.toString(numero);
				CuentaCorriente nueva = new CuentaCorriente(ultimaCuenta, cuenta1.cliente, cuenta1.saldo+cuenta2.saldo);
				cuentasActivas--;
				cuenta1.cerrarCuenta();
				cuenta2.cerrarCuenta();
				return nueva;
			}
		}
		return null;
	}


}

