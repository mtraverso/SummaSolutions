package ar.com.summa.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
	private long id;
	private String name;
	private Map<Long,Employee> employees = new HashMap<Long,Employee>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployees() {
		return new ArrayList<Employee>(employees.values());
	}
	
	public void addEmployee(Employee employee){
		this.employees.put(employee.getId(), employee);
	}
	
	public Employee findEmployeeById(long id){
		return this.employees.get(id);
	}
	
	public float findAverageAge(){
		float sum = 0;
		for(Employee e : this.employees.values()){
			sum += e.getAge();
		}
		return ( sum / this.employees.size());
	}
}
