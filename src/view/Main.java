package view;
import javax.swing.JOptionPane;
import controller.FatorialDuplo; 

public class Main {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro �mpar diferente de zero: "));

		FatorialDuplo dfCont = new FatorialDuplo();
		int resultado = dfCont.calculaDFat(n);
		System.out.println("Fatorial duplo de " + n + ": " + resultado);
	
	}

}
