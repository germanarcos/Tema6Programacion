
public class main {

	public static void main(String[] args) {
		Fecha fecha = new Fecha(1,1,2019);
		Fecha fecha2 = new Fecha(1,1,2020);
		System.out.println(fecha.diferenciaFecha(fecha2));
	}
}