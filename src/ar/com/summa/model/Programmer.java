package ar.com.summa.model;

import ar.com.summa.model.enums.Language;

public class Programmer extends Employee {
	private Language language;

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
	public String toString(){
		return super.toString()+
				"Language: "+language+"\n";
	}
}
