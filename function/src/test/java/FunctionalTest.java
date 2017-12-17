import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionalTest {
    @Test
    public void testAXplusB(){
        Function f = new AXplusB(1 ,5,5 ,3);
        assertEquals(8,f.f(f.getA()),0);
    }

    @Test
    public void testAexpXplusB() throws FunctionalException {
        AexpXplusB f = new AexpXplusB(1 ,5,5 ,3);
        assertEquals(16.5914091,f.f(f.getA()),0.00001);
    }


    @Test
    public void testAsinBX() throws FunctionalException {
        AsinBX f = new AsinBX(1 ,5,5 ,3);
        assertEquals(0.70560004,f.f(f.getA()),0.00001);
    }

    @Test
    public void testAXplusBdivideCXplusD() throws FunctionalException {
        AXplusBdivideCXplusD f = new AXplusBdivideCXplusD(1 ,5,5 ,3,8 , 4);
        assertEquals(0.666666667,f.f(f.getA()),0.00001);
    }


    @Test(expected = FunctionalException.class)
    public void testException() throws FunctionalException {
        AXplusB f = new AXplusB(4 ,5,5 ,3);
        Functional<AXplusB> g = new DefiniteIntegral(-1, 0 ,5);
        g.eval(f);
    }


    @Test
    public void testSumEndsAndMid() throws FunctionalException {
        AXplusB f1 = new AXplusB(1 ,5,5 ,3);
        AexpXplusB f2 = new AexpXplusB(1 ,5,5 ,3);
        AsinBX f3 = new AsinBX(1 ,5,5 ,3);
        AXplusBdivideCXplusD f4 = new AXplusBdivideCXplusD(1 ,5,5 ,3,8 , 4);

        Functional<Function> g = new SumEndsAndMid();

        assertEquals(54,g.eval(f1),0);
        assertEquals(865.084,g.eval(f2),0.001);
        assertEquals(6.0176,g.eval(f3),0.0001);
        assertEquals(1.9458,g.eval(f4),0.0001);
    }

    @Test
    public void testDefiniteIntegral() throws FunctionalException {
        AXplusB f1 = new AXplusB(1 ,5,5 ,3);
        AexpXplusB f2 = new AexpXplusB(1 ,5,5 ,3);
        AsinBX f3 = new AsinBX(1 ,5,5 ,3);
        AXplusBdivideCXplusD f4 = new AXplusBdivideCXplusD(1 ,5,5 ,3,8 , 4);

        Functional<Function> g = new DefiniteIntegral(1,5,10000);

        assertEquals(72,g.eval(f1),0);
        assertEquals(740.47,g.eval(f2),0.01);
        assertEquals(-0.38384,g.eval(f3),0.0001);
        assertEquals(2.5812,g.eval(f4),0.001);
    }
}
