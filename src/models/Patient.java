package models;

public class Patient extends Person {
	
	private float weight;
	private float height;
	
	public Patient(String name, int age, char sex) {
		super(name, age, sex);
	}
	
	public void setWeight(float weight ) {
		this.weight = weight;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getheight() {
		return this.height;
	}

}
