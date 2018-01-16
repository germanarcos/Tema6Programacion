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
	/**
	 * 
	 * @param cuenta
	 * @param cantidad
	 */
	public CuentaCorriente(String cuenta, double cantidad){
		numCuenta=cuenta;
		saldo=cantidad;
	}
	public void ingresaEfectivo (double cantidad){
		saldo+=cantidad;
	}
	/**
	 * 
	 * @param cantidad
	 * @return Devuelve un booleano, verdadero si ha conseguido realizar la operación,
	 * falso si no, si consigue realizarla hace el cálculo
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
	public void visualiza(){
		System.out.println("El número de cuenta es: "+numCuenta);
		System.out.println("El saldo es:" +saldo);
	}
}
