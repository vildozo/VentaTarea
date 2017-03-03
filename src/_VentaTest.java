import static org.junit.Assert.*;

import org.junit.Test;

public class _VentaTest {

	@Test
	public void noTenemosProductos() {
		Venta store = new Venta();
		assertEquals(0,store.cantidadDeProductos());
	}
	
	@Test
	public void agregarUnProductoAVenta() {
		Venta store = new Venta();
		double tiempo=2;
		double costo=50;
		Product aspirado = new Servicio(tiempo,costo);
		store.addProduct(aspirado);
		assertEquals(1,store.cantidadDeProductos());
	}
	
	@Test
	public void costoDeUnProductoServicio()
	{
		Venta store = new Venta();
		double tiempo=2;
		double costo=50;
		Product aspirado = new Servicio(tiempo,costo);
		store.addProduct(aspirado);
		assertEquals(20,store.total(),0.01);
	}
	
	@Test
	public void costoDeUnProductoArticulo()
	{
		Venta store = new Venta();
		double cantidad=2;
		double costo=50;
		Product aspirado = new Articulo(costo,cantidad);
		store.addProduct(aspirado);
		assertEquals(100,store.total(),0.01);
	}
	

}
