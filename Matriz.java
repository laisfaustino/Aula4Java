package aula04;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
	int[][] matrizInteiros = {{10,15,35},{70,120,14,},{50,100,150}};
	
	float numero;
	
	float matrizFloat[][]= new float [2][3];
	
		 for(int iLinha =0; iLinha < matrizInteiros.length; iLinha ++) {
			 for(int iColuna =0; iColuna < matrizInteiros.length; iColuna ++){
				 System.out.println(matrizInteiros[iLinha][iColuna]);
				  }
		 		}
			 for(int iLinha =0; iLinha < matrizFloat.length; iLinha ++) {
				 for(int iColuna =0; iColuna < matrizFloat[iLinha].length; iColuna ++){
					 System.out.println("Digite um numero:");
					 numero =leia.nextFloat();		 }
		}
	}

}
