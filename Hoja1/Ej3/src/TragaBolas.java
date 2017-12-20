/**
 * 
 * @author German Arcos
 * @version 1.0
 * 
 *
 */
public class TragaBolas {
	/**
	 * @param color String que contiene el color del tragabolas
	 * @param bolasComidas Nº de bolas que ha comido el tragabolas
	 * @param maxBolas Nº de bolas que puede llegar a comer
	 */
	private String color;
	private int bolasComidas;
	private int maxBolas;
	public void TragaBolas(String Color, int Bolas){
		bolasComidas=0;
		maxBolas=Bolas;
		color = Color;
	}
	public void visualizar(){
		System.out.println("El tragabolas es de color " + color+"\n");
		System.out.println("El tragabolas ha comido "+bolasComidas+" bolas.\n");
		System.out.println("El tragabolas puede comer "+maxBolas+" bolas.\n");
	}
	public void comer(){
		if(bolasComidas<maxBolas){
			System.out.println("He comido una bola.\n");
			bolasComidas+=1;
		}
		else{
			System.out.println("No puedo comer más.\n");
		}
	}
	public void trotar(){
		if(bolasComidas>=1){
			System.out.println("Estoy trotando.\n");
			bolasComidas-=1;
		}else{
			System.out.println("No tengo energía para trotar.\n");
		}
	}
	public void dormir(){
		if(bolasComidas==maxBolas){
			System.out.println("Tripa llena. ZZZZZ\n");
			bolasComidas/=2;
		}
		else{
			System.out.println("No quiero dormir.\n");
		}
	}
}
