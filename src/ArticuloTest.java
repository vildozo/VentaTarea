

import static org.junit.Assert.*;

import org.junit.Test;


public class ArticuloTest{

	@Test
	public void ceroArticulo() {
		Product mouse= new Articulo();
		assertEquals(0, mouse.total());
	}
	
	
	@Test
	public void unArticulo() {
		int cantidad=3;
		int precio=8;
		Product mouse= new Articulo(precio,cantidad);
		assertEquals(24, mouse.total());
	}

}
