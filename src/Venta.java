import java.util.ArrayList;

public class Venta implements Product {
	
	ArrayList <Product> productos= new ArrayList <Product> ();
	double costoTotal=0.0;
	

	public Venta(){}
	
	public int cantidadDeProductos(){
		return productos.size();
	}
	
	public void addProduct(Product newProducto){
		productos.add(newProducto);
	}

	
	public double total() {
		for(int contadorProductos=0;contadorProductos<productos.size();contadorProductos++)
		{
			costoTotal+=productos.get(contadorProductos).total();
		}
		return costoTotal;
	}
	
	

}
