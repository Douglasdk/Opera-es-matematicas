package aula1;

import javax.swing.JOptionPane;

public class Avan�ado {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entrada do numero1 pela Caixa de Dialogo
		String numero1 = JOptionPane.showInputDialog("Entre com um n�mero inteiro:\n");
		
		//entrada do numero2 pela Caixa de Dialogo
		String numero2 = JOptionPane.showInputDialog("Entre com um n�mero inteiro:\n");	
		
		String opcao = JOptionPane.showInputDialog("Entre com a opera��o correspondente:\n 1 - Adi��o \n 2 - Subtra��o \n 3 - Multiplica��o \n 4 - Divis�o");	
		
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