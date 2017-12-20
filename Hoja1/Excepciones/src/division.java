/**
 *aaaaa descripcion etc etc
 *@author Germán Arcos
 *@version 1.0
 *
 */
public class division {
	/**
	 * 
	 * @param x El dividendo de la operación
	 * @param y El divisor de la operación
	 * @return Devuelve el resultado de la operación
	 * @throws Exception En caso de que se intente dividir entre 0 lanza una excepción
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
