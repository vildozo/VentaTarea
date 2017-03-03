

public class Articulo implements Product{
	double precio=0;
	double cantidad=0;
	
	public Articulo(){

	}
	
	
	public Articulo(double price, double quantity){
		this.precio=price;
		this.cantidad=quantity;
	}
	
	
	public double total() {
		// TODO Auto-generated method stub
		return precio*cantidad;
	}

}
