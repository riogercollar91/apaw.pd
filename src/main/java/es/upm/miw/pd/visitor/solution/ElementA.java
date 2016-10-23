package es.upm.miw.pd.visitor.solution;

public class ElementA implements Element {
    private String attributeA;

    public ElementA() {
        this.setAttributeA("A");
    }

    public String getAttributeA() {
        return this.attributeA;
    }

    public void setAttributeA(String attributeA) {
        this.attributeA = attributeA;
    }

    public void accept(Visitor v) {
        v.visitElementA(this);
    }

}
