/**
 * Task Number 03
 * 
 * @author Walesson Silva
 * @date 2019-09-20
 */

package tasks;

import java.util.ArrayList;
import java.util.List;
import interfaces.Runner;

import javax.swing.JOptionPane;

import models.Person;

public class ManAndWoman implements Runner {
	List<Person> people 	= new ArrayList<Person>();
	private int quantity 	= 0;
	String namePerson;
	int agePerson 			= 0;
	char sexPerson;
	int totalMan 			= 0;
	int totalWoman 			= 0;
	
	public ManAndWoman(int quantity) {
		// Mock Data People
		this.quantity = quantity;
		for(int indice = 0; indice < this.quantity; indice++) {
			this.namePerson = "Person "+(indice+1);
			this.agePerson = (int) (Math.random() * 60);
			this.sexPerson = (indice % 2) == 0 ? 'F' : 'M';
			
			this.people.add(new Person(this.namePerson, this.agePerson, this.sexPerson));
		}
	}
	
	@Override
	public void runner() {
		for(Person person : this.people) {
			if(person.getAge() >= 18 && person.getSex() == 'F') {
				this.totalWoman++;
			}
			
			if(person.getAge() >= 18 && person.getSex() == 'M') {
				this.totalMan++;
			}
		}
		
		JOptionPane.showMessageDialog(null,"TOTAL DE MAIORES DE IDADE\n" 
				+"Mulheres: "+this.totalWoman
				+"\nHomens: "+this.totalMan);
		
		this.showPeople();
	}
	
	public void showPeople() {
		for(Person person : this.people) {
			System.out.println("Name: "+person.getName()
			+"\nAge: "+person.getAge()
			+"\nSex: "+person.getSex()
			+"\n\n");
		}
	}
	
}
