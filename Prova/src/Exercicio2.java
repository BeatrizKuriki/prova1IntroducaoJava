import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario = 1000.00;	
		double aumento =0.015;
	
		
		for (int i=0; i<27;i++) {
			
			salario= salario +(salario * aumento);
			aumento= aumento *2;
		}
		
		System.out.println("O salário do funcionário em 2022 será de R$ " + salario);

	}

}
//