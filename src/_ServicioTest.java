import static org.junit.Assert.*;

import org.junit.Test;

public class _ServicioTest {

	@Test
	public void test() {
		Product aspirado = new Servicio();
		assertEquals(0,aspirado.total());
	}

}
