package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumberFr extends NaturalNumber {
	
    public NaturalNumberFr(int value) {
		super(value);
		String[] textValue = {"zéro", "un", "deux", "trois", "quatre", "cinq"};
		this.setTextValue(textValue);
		
	}

}
