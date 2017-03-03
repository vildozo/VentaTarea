

public class Articulo implements Product{
	int precio=0;
	int cantidad=0;
	
	public Articulo(){

	}
	
	
	public Articulo(int price, int quantity){
		this.precio=price;
		this.cantidad=quantity;
	}
	
	
	public int total() {
		// TODO Auto-generated method stub
		return precio*cantidad;
	}

}
