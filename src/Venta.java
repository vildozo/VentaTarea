

public class Venta implements Product {
	Product[] productos = {};
	

	public Venta(){}
	
	public int cantidadDeProductos(){
		return productos.length;
	}
	
	public void addProduct(Product newProducto){
		productos[cantidadDeProductos()]=newProducto;
	}

	@Override
	public double total() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
