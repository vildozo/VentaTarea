import static org.junit.Assert.*;

import org.junit.Test;

public class _ServicioTest {

	@Test
	public void test() {
		Product aspirado = new Servicio();
		assertEquals(0.0,aspirado.total(),0.01);
	}
	
	@Test
	public void aspiradoDe2Horas() {
		double tiempo=2;
		double costo=40;
		Product aspirado = new Servicio(tiempo,costo);
		assertEquals(80.0,aspirado.total(),0.01);
	}

}
