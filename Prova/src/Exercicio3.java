import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float massaInicial;
		float massaFinal;
		float tempHora=0;
		float tempMinuto=0;
		float tempSegundo=0;
		float tempo =0;
		
		System.out.println("Qual a massa do elemento radiotivo em gramas?");
		massaInicial = sc.nextFloat();
		
		massaFinal = massaInicial;
		
		while(massaFinal>0.5) {
			massaFinal = massaFinal/2;
			tempo = tempo + 50;
			
			
			tempHora = (tempo/3600);
			tempMinuto = (tempo %3600)/60;
			tempSegundo = (tempo%3600)%60;
		}
		
		System.out.println("O tempo gasto é igual a : "+tempHora+" horas");
		System.out.println("O tempo gasto é igual a : "+tempMinuto+" minutos");
		System.out.println("O tempo gasto é igual a : "+tempSegundo+" segundos");
		
	

	}

}
