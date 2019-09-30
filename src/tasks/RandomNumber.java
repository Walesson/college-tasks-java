
/**
 * Task Number 01
 * 
 * @author Walesson Silva
 * @date 2019-09-20
 */

package tasks;

import interfaces.Runner;

public class RandomNumber implements Runner {
	
	private int length = 50;
	private int max;
	public int numbers[];
	
	
	public RandomNumber(int length, int max) {
		this.length = length;
		this.max = max;
		this.numbers = new int[length];
	}
	
	@Override
	public void runner() {
		this.numbers = this.getNumbers();
		this.showNumbers();
	}
	
	public int[] getNumbers() {
		for(int indice = 0; indice < this.length; indice++) {
			this.numbers[indice] = (int) (Math.random() * this.max);
		}
		return this.numbers;
	}
	
	public void showNumbers() {
		for(int indice = 0; indice < this.length; indice++) {
			System.out.println((indice+1)+"º Número: " + this.numbers[indice]);
		}
	}
}
