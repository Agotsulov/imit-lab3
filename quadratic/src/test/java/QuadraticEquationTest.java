
import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;

public class QuadraticEquationTest {
    @Test
    public void testNotNull(){
        QuadraticEquation qe = new QuadraticEquation(13,4,5);
        assertNotEquals(qe, null);
    }

    @Test
    public void testTwoRoots(){
        QuadraticEquation qe = new QuadraticEquation(1,3,-4);
        double[] result = qe.solve();

        assertEquals(1,result[0],0);
        assertEquals(-4,result[1],0);
    }


    @Test
    public void testOneRoots(){
        QuadraticEquation qe = new QuadraticEquation(1,4,4);
        double[] result = qe.solve();

        assertEquals(-2,result[0],0);
        assertEquals(-2,result[1],0);
    }


    @Test
    public void testNoRoots(){
        QuadraticEquation qe = new QuadraticEquation(1,1,4);
        double[] result = qe.solve();

        assertEquals(NaN,result[0],0);
        assertEquals(NaN,result[1],0);
    }

}
