package es.upm.miw.pd.visitor.solution;

public class ElementB implements Element {
    private String attributeB;

    public ElementB() {
        this.setAttributeB("B");
    }

    public String getAttributeB() {
        return this.attributeB;
    }

    public void setAttributeB(String attributeB) {
        this.attributeB = attributeB;
    }

    public void accept(Visitor v) {
        v.visitElementB(this);
    }

}
