
public class Servicio implements Product{
	double horas;
	double precio;
	
	public Servicio(){}
	
	public Servicio(double time, double price){
		this.horas=time;
		this.precio=price;
	}

	
	public double total() {
		return horas*precio*0.2;
	}
}
