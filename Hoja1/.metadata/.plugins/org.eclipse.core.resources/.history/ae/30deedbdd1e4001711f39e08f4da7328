public class Main {
	public static void main(String[] args) {
		Clock clock = new Clock();
		Time time = new Time(clock);
		Thread thread = new Thread(time);
		boolean parado = false;;
		Console.print("Presiona [Enter] para iniciar tu reloj");
		Console.readEnter();
		thread.start();

		for (int loop = 0; loop > -1; loop++) {
			if(parado==false){
				Console.print("Presiona [Enter] para ver la hora o [S + Enter] para detener el reloj y visualizar la hora");
			}else{
				Console.print("Presiona [Enter] para ver reiniciar el reloj y ver la hora o [S + Enter] para introducir una hora e iniciar el reloj");
			}
			String inputText = Console.readEnter()+" ";

			if (Check.textChar(inputText.charAt(0), "S")) {
				if(parado==false){
					try {
						thread.wait();
						parado = true;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					thread.notify();
					Console.setTime(clock, "Introduce la nueva hora");
				}
			}else{
				if(parado==true){
					thread.notify();
				}
			}

			Console.printTime(clock);
		}
	}
}

/*
Desarrollar un programa en Java que utilice una clase que se
llame {Horaconmiembros} detipo intpara hora, minutos y segundos.
Deberá tener unconstructor para inicializar la hora a  0  o  a
una  hora  determinada  (hora,  minutos,  segundos).Se  deberá
poder  sumar  y  restar horas,así como imprimir y leer una hora.
El formato de impresión y lectura será hh:mm:ss, todo en modo
24 horas.
 */