public class BiggestRoot {

    QuadraticEquation qe;

    public BiggestRoot(QuadraticEquation q){
        qe = q;
    }

    public double biggest() throws NaNException {
        double[] result = qe.solve();
        if((new Double(result[0]).equals(Double.NaN)) || (new Double(result[1]).equals(Double.NaN))) throw new NaNException();
        if(result[0] > result[1]) return result[0];
        else return result[1];
    }

}

