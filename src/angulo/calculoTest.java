package angulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculoTest {

	@Test
	public void testProdpunto() {
		int x[] = new int [3];
		int y[] = new int [3];
		x[0] =2;
		x[1] =5;
		x[2] =3;
		y[0] =3;
		y[1] =4;
		y[2] =5;
		System.out.println("verificando producto punto");
		calculo c = new calculo();
		assertTrue(c.prodpunto(x, y) == 41 );
		assertTrue(c.prodpunto(x, y) == 4);
		
		fail("Not yet implemented");
	}

	@Test
	public void testMagnitud() {
		int x[] = new int [3];
		x[0] =2;
		x[1] =5;
		x[2] =3;
		System.out.println("verificando magnitud");
		calculo c = new calculo();
		assertTrue(c.magnitud(x) == 6.14);
		
		
		fail("Not yet implemented");
	}

}
