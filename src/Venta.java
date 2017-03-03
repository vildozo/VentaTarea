import java.util.ArrayList;

public class Venta implements Product {
	
	ArrayList <Product> productos= new ArrayList <Product> ();
	

	public Venta(){}
	
	public int cantidadDeProductos(){
		return productos.size();
	}
	
	public void addProduct(Product newProducto){
		productos.add(newProducto);
	}

	
	public double total() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
