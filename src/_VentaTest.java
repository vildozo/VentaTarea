import static org.junit.Assert.*;

import org.junit.Test;

public class _VentaTest {

	
	double tiempo=2;
	double costo=50;
	double cantidad=2;
	Product aspirado = new Servicio(tiempo,costo);
	Product aspiradora = new Articulo(costo,cantidad);
	
	
	@Test
	public void noTenemosProductos() {
		Venta store = new Venta();
		assertEquals(0,store.cantidadDeProductos());
	}
	
	@Test
	public void agregarUnProductoAVenta() {	
		Venta store = new Venta();
		store.addProduct(aspirado);
		assertEquals(1,store.cantidadDeProductos());
	}
	
	@Test
	public void costoDeUnProductoServicio()
	{
		Venta store = new Venta();
		store.addProduct(aspirado);
		assertEquals(20,store.total(),0.01);
	}
	
	@Test
	public void costoDeUnProductoArticulo()
	{
		Venta store = new Venta();
		store.addProduct(aspiradora);
		assertEquals(100,store.total(),0.01);
	}
	
	@Test
	public void costoDeDosProductoArticuloYServicio()
	{
		Venta store = new Venta();
		store.addProduct(aspiradora);
		store.addProduct(aspirado);
		assertEquals(120.0,store.total(),0.01);
		
		
	}
	

}
