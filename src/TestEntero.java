//import static org.junit.Assert.*;
//import org.junit.Test;
import junit.framework.TestCase;
public class TestEntero extends TestCase{
	//@Test
	public void test1() {
    		Entero e1=new Entero(4);
    		assertEquals(true, e1.esPar());
    }
	public void test2() {
    		Entero e2=new Entero(5);
    		assertEquals(false, e2.esPar());
    }

}
