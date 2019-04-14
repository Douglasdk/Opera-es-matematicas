package aula;

import javax.swing.JOptionPane;

public class Interação {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entrada do numero1 pela Caixa de Dialogo
		String numero1 = JOptionPane.showInputDialog("Entre com um número inteiro:\n");
		
		//entrada do numero2 pela Caixa de Dialogo
		String numero2 = JOptionPane.showInputDialog("Entre com um número inteiro:\n");	
		
		// soma dos números 
		int soma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
		
		//exibir o resultado
		JOptionPane.showMessageDialog(null, soma);
		}
	

}
