public class Fecha {

	private int dia;
	private int anyo;
	private int mes;
	private int diamax;
	Fecha(int dia, int mes, int anyo){
		this.dia=dia;
		this.anyo=anyo;
		this.mes=mes;
		if(this.esCorrecta()==true){
			System.out.println("Se ha introducido una fecha correcta.");
		}else{
			System.out.println("Se ha introducido una fecha incorrecta");
			this.dia=0;
			this.anyo=0;
			this.mes=0;
		}
	}
	Fecha(int dia, int mes, int anyo,boolean mod){
		this.dia=dia;
		this.anyo=anyo;
		this.mes=mes;
		if(this.esCorrecta()==true && mod==false){
			System.out.println("Se ha introducido una fecha correcta.");
		}else{
			if(mod==true){
				System.out.println("Se ha introducido una fecha incorrecta");
			}
			this.dia=0;
			this.anyo=0;
			this.mes=0;
		}
	}


	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}

	public boolean esBisiesto(){
		if(anyo%4==0)
			return true;
		else
			return false;
	}
	public boolean esCorrecta(){
		if(mes>0 && mes<=12){
			diamax=getDiasMes();
			if(dia>diamax){
				return false;
			}else{
				if (anyo>0){
					return true;
				}else{
					return false;
				}
			}
		}//fin if del mes
		else{
			return false;
		}
	}
	public String getCadenaMes(){
		String cadenaMes = null;
		switch (mes){
			case 1:
				cadenaMes="Enero";
				break;
			case 2:
				cadenaMes="Febrero";
				break;
			case 3:
				cadenaMes="Marzo";
				break;
			case 4:
				cadenaMes="Abril";
				break;
			case 5:
				cadenaMes="Mayo";
				break;
			case 6:
				cadenaMes="Junio";
				break;
			case 7:
				cadenaMes="Julio";
				break;
			case 8:
				cadenaMes="Agosto";
				break;
			case 9:
				cadenaMes="Septiembre";
				break;
			case 10:
				cadenaMes="Octubre";
				break;
			case 11:
				cadenaMes="Noviembre";
				break;
			case 12:
				cadenaMes="Diciembre";
				break;
			case 0:
				break;
			default:
				cadenaMes=null;
				break;
				
		}
		return cadenaMes;
	}
	public Integer getDiasMes(){
		Integer dias;
		switch (mes){
			case 0:
				dias = null;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dias=30;
				break;
			case 2:
				if(anyo%4==0){
					dias=29;
				}else{
					dias=28;
				}
				break;
			default:
				dias=31;
				break;
		}
		return dias;
	}	
	public String getCadenaFecha1(){
		String cadenaFecha;
		cadenaFecha = dia+"--"+mes+"--"+anyo;
		return cadenaFecha;
	}	
	public String getCadenaFecha2(){
		String cadenaFecha;
		cadenaFecha = dia + " de " +getCadenaMes()+ " de " + anyo;
		return cadenaFecha;
	}
	public Integer diferenciaFecha(Fecha fecha2){
		//Fecha mayor sobre la que se llama el metodo
		Integer num=0;
		Fecha temp= new Fecha(fecha2.dia,fecha2.mes,fecha2.anyo,true);
		if(temp.anyo>this.anyo){
			temp.anyo=this.anyo;
			this.anyo=fecha2.anyo;
			this.mes=fecha2.mes;
			this.dia=fecha2.dia;
		}
		for(;temp.anyo<this.anyo;temp.anyo=(temp.anyo+1)){
			if(temp.getAnyo()%4==0){
				num+=366;
			}
			else{
				num+=365;
			}
		}
		if(temp.mes!=this.mes){
			if(temp.mes>this.mes){
				for(;temp.mes>this.mes;temp.mes-=1){
					num-=temp.getDiasMes();
				}
			}
			else{
				for(;temp.mes<this.mes;temp.mes+=1){
					num+=temp.getDiasMes();
				}
			}
		}
		if(temp.dia!=this.dia){
			if(temp.dia>this.dia){
				num-=(temp.dia-this.dia);
			}
			else{
				num+=(this.dia-temp.dia);
			}
		}
		return num;
	}
	public Fecha sumaDias(Integer num){
		while(num>0){
			Integer maxDias = getDiasMes();
			if(this.dia+num>maxDias){
				num=num-(maxDias-dia)-1;
				this.dia=1;
				if(this.mes<12){
					this.mes+=1;
				}else{
					this.mes=1;
					this.anyo++;
				}
			}else{
				this.dia+=num;
				num=0;
			}
		}	
		return this;
	}

}