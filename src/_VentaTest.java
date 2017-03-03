import static org.junit.Assert.*;

import org.junit.Test;

public class _VentaTest {

	@Test
	public void noTenemosProductos() {
		Venta store = new Venta();
		assertEquals(0,store.cantidadDeProductos());
	}

}
