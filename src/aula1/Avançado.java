package aula1;

import javax.swing.JOptionPane;

public class Avançado {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entrada do numero1 pela Caixa de Dialogo
		String numero1 = JOptionPane.showInputDialog("Entre com um número inteiro:\n");
		
		//entrada do numero2 pela Caixa de Dialogo
		String numero2 = JOptionPane.showInputDialog("Entre com um número inteiro:\n");	
		
		String opcao = JOptionPane.showInputDialog("Entre com a operação correspondente:\n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");	
		
		int op = Integer.parseInt(opcao);
		int total = 0;
		if (op == 1) {
			total = Integer.parseInt(numero1) + Integer.parseInt(numero2);		
		}else if (op == 2) {
			total = Integer.parseInt(numero1) - Integer.parseInt(numero2);	
		}else if (op == 3) {
			total = Integer.parseInt(numero1) * Integer.parseInt(numero2);	
		}else {
			total = Integer.parseInt(numero1) / Integer.parseInt(numero2);
		}	

		//exibir o resultado
		JOptionPane.showMessageDialog(null, total);
		}
	

}