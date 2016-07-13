package ar.com.summa.model;

import ar.com.summa.model.enums.DesignerType;

public class Designer extends Employee {
	private DesignerType type;

	public DesignerType getType() {
		return type;
	}

	public void setType(DesignerType type) {
		this.type = type;
	}
	
	public String toString(){
		return super.toString()+
				"Type: "+type+"\n";
	}
}
