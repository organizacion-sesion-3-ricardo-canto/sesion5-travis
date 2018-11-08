import static org.junit.Assert.*;
import org.junit.Test;
public class TestEntero {
	@Test
	public void testSimple() {
    Entero e1=new Entero(4);
    Entero e2=new Entero(5);
		assertEquals(true, e1.esPar());
    assertEquals(false, e2.esPar());
		}
	

}
