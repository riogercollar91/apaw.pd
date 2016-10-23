package es.upm.miw.pd.composite.expression.solution;

public class Multiplicacion extends Expression {
    public Expression exp1;

    public Numero exp2;

    public Multiplicacion(Expression exp1, Numero numero) {
        super();
        this.exp1 = exp1;
        this.exp2 = numero;
    }

    private int devNumero(Expression exp1) {
        Numero n = (Numero) exp1;
        int n1 = n.numero;
        return n1;
    }

    @Override
    public int operar() {
        int num1 = devNumero(exp1);
        int num2 = devNumero(exp2);
        return num1 * num2;
    }

}
