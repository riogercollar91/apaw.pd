package es.upm.miw.pd.visitor.solution;

public class Visitor2 extends Visitor {

    int contadorElementoA = 0;

    int contadorElementoB = 0;

    @Override
    public void visitElementA(ElementA e) {
        System.out.println("Visitador 2 --> elemento: " + e.getAttributeA());
        contadorElementoA++;
    }

    @Override
    public void visitElementB(ElementB e) {
        System.out.println("Visitador 2 --> elemento: " + e.getAttributeB());
        contadorElementoB++;
    }

    @Override
    public int getAs() {
        return contadorElementoA;
    }

    @Override
    public int getBs() {
        return contadorElementoB;
    }

}
