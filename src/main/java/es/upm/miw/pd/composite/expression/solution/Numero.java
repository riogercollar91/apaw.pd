package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expression {

    public int numero;

    public Numero(int numero) {
        super();
        this.numero = numero;
    }

    @Override
    public int operar() {
        return this.numero;

    }

}
