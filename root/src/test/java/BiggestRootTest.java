import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BiggestRootTest {
    @Test
    public void testNotNull(){
        QuadraticEquation qe = new QuadraticEquation(13,4,5);
        BiggestRoot br = new BiggestRoot(qe);
        assertNotEquals(br, null);
    }

    @Test
    public void testTwoRoots(){
        QuadraticEquation qe = new QuadraticEquation(1,3,-4);
        BiggestRoot br = new BiggestRoot(qe);
        try {
            assertEquals(1,br.biggest(),0);
        } catch (NaNException e) {
            e.printStackTrace();
        }
    }


    @Test(expected = NaNException.class)
    public void testOneRoots() throws NaNException {
        QuadraticEquation qe = new QuadraticEquation(1,1,4);
        BiggestRoot br = new BiggestRoot(qe);
        br.biggest();
    }


}
