
/**
 * Task Number 02
 * 
 * @author Walesson Silva
 * @date 2019-09-20
 */

package tasks;

import javax.swing.JOptionPane;

import interfaces.Runner;

public class GuessNumber implements Runner {
	
	private int number;
	private int chosen;
	private int attempts = 0;
	
	public GuessNumber (RandomNumber number) {
		this.number = number.getNumbers()[0];
	}
	
	public void runner() {
		do {
			this.chosen = Integer.parseInt(
					JOptionPane.showInputDialog("# ADVINHAR O NÚMERO DE 1 À 100\n"
					+ "- Informe um número para continuar ?")
		    ); // End parseInt
			
			this.attempts++;
			
			if(this.chosen > this.number) {
				JOptionPane.showMessageDialog(null, "Valor "+this.chosen+" informado é maior que o número escolhido!");
			}
			
			if(this.chosen < this.number) {
				JOptionPane.showMessageDialog(null, "Valor "+this.chosen+" informado é menor que o número escolhido!");
			}
		
		} while ( this.chosen != this.number );
		
		JOptionPane.showMessageDialog(null, "NÚMERO DESCOBERTO!!!\n"
				+"Número escolhido foi "+this.number
				+"\nTentativas: "+this.attempts);
	}

}
