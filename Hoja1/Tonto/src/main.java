
public class main {
	public static void main(String[] args){
		int x =5;
		int y = 0;
		try{
		System.out.println(x/y);
		}catch (Exception tonto){
			System.out.println("Eres tonto y lo has hecho mal");
			System.out.println(tonto.toString());
		}
	}

}
