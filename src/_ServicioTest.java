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
		double costo=50;
		Product aspirado = new Servicio(tiempo,costo);
		assertEquals(20.0,aspirado.total(),0.01);
	}

}
