

import static org.junit.Assert.*;

import org.junit.Test;


public class _ArticuloTest{

	@Test
	public void ceroArticulo() {
		Product mouse= new Articulo();
		assertEquals(0, mouse.total(),0.01);
	}
	
	
	@Test
	public void unArticulo() {
		double cantidad=3;
		double precio=8;
		Product mouse= new Articulo(precio,cantidad);
		assertEquals(24, mouse.total(),0.01);
	}

}
