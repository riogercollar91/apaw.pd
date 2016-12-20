package es.upm.miw.pd.composite.expression.solution;

public abstract class CompositeExpression extends Expression {
		
	private Expression exp1;
	private Expression exp2;
	
	public CompositeExpression(Expression exp1,Expression exp2){
        this.exp1=exp1;
        this.exp2=exp2;
    }
    
    public Expression getExpression1(){
        return this.exp1;
    }
    
    public Expression getExpression2(){
        return this.exp2;
    }
	
	public abstract int operar();

}
