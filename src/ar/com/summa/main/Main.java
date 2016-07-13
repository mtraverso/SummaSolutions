package ar.com.summa.main;

import ar.com.summa.model.Company;
import ar.com.summa.model.Designer;
import ar.com.summa.model.Employee;
import ar.com.summa.model.Programmer;
import ar.com.summa.model.enums.DesignerType;
import ar.com.summa.model.enums.Language;

public class Main {
	public static Programmer buildProgrammer(String firstName, String lastName, int age, Language language){
		Programmer e = new Programmer();
		e.setFirstName(firstName);
		e.setLastName(lastName);
		e.setAge(age);
		e.setLanguage(language);
		return e;
	}
	
	public static Designer buildDesigner(String firstName, String lastName, int age, DesignerType type){
		Designer e = new Designer();
		e.setFirstName(firstName);
		e.setLastName(lastName);
		e.setAge(age);
		e.setType(type);
		return e;
	}
	
	
	public static void main(String[] args) {
		long ids = 0;
		Employee e1 = buildProgrammer("Matias", "Traverso", 30, Language.JAVA);
		Employee e2 = buildProgrammer("Tomas", "Traverso", 20, Language.PYTHON);
		Employee e3 = buildProgrammer("Pedro", "Traverso", 19, Language.NET);
		Employee e4 = buildProgrammer("Martin", "Traverso", 37, Language.PHP);
		Employee e5 = buildDesigner("Santiago", "Traverso", 35, DesignerType.GRAPHIC);
		Employee e6 = buildDesigner("Gaston", "Traverso", 36, DesignerType.WEB);
		Employee e7 = buildDesigner("Agustina", "Traverso", 33, DesignerType.GRAPHIC);
		Employee e8 = buildProgrammer("Angeles", "Traverso", 24, Language.JAVA);
		Employee e9 = buildProgrammer("Lucila", "Traverso", 24, Language.JAVA);
		
		e1.setId(ids++);
		e2.setId(ids++);
		e3.setId(ids++);
		e4.setId(ids++);
		e5.setId(ids++);
		e6.setId(ids++);
		e7.setId(ids++);
		e8.setId(ids++);
		e9.setId(ids++);
		
		Company traversos = new Company();
		traversos.addEmployee(e1);
		traversos.addEmployee(e2);
		traversos.addEmployee(e3);
		traversos.addEmployee(e4);
		traversos.addEmployee(e5);
		traversos.addEmployee(e6);
		traversos.addEmployee(e7);
		traversos.addEmployee(e8);
		traversos.addEmployee(e9);
		
		System.out.println("-------Employee list ---------");
		System.out.println(traversos.getEmployees());
		System.out.println();
		
		System.out.println("-------Employee Id: 5 ---------");
		System.out.println(traversos.findEmployeeById(5));
		System.out.println();
		
		System.out.println("-------Employee Id: 3 ---------");
		System.out.println(traversos.findEmployeeById(3));
		System.out.println();
		
		System.out.println("-------Average age ---------");
		System.out.println(traversos.findAverageAge());
	}
	
}
