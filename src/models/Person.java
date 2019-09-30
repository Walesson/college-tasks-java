package models;

public class Person {
	
	private String name;
	private int age;
	private char sex;
	
	public Person(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public char getSex() {
		return this.sex;
	}
	
}
