/**
 *aaaaa descripcion etc etc
 *@author Germ�n Arcos
 *@version 1.0
 *
 */
public class division {
	/**
	 * 
	 * @param x El dividendo de la operaci�n
	 * @param y El divisor de la operaci�n
	 * @return Devuelve el resultado de la operaci�n
	 * @throws Exception En caso de que se intente dividir entre 0 lanza una excepci�n
	 */
	public static double divisionReal(double x,double y) throws Exception{
		double resultado;
		if(y!=0){
			resultado = x/y;
		}else{
			throw new Exception();
		}
		return resultado;
	}
}
