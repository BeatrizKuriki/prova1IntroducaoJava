import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n1;
	    int n2;
	    int n3;
	    int n4;
	    int n5;
	    int maior=0;
	    int menor=0;
	    
	    System.out.println("Digite cinco números:");
	    n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5= sc.nextInt();
		
		if(n1>n2 && n1>n3 && n1>n4 && n1>n5) {
			maior= n1;
		} else if(n2>n1 && n2>n3 && n2>n4 && n2>n5){
			maior = n2;
		}else if(n3>n1 && n3>n2 && n3>n4 && n3>n5){
			maior = n3;
		}else if(n4>n1 && n4>n2 && n4>n3 && n4>n5){
			maior = n4;
		}else {
			maior = n5;
		}
		
		if(n1<n2 && n1<n3 && n1<n4 && n1<n5) {
			menor= n1;
		} else if(n2<n1 && n2<n3 && n2<n4 && n2<n5){
			menor = n2;
		}else if(n3<n1 && n3<n2 && n3<n4 && n3<n5){
			menor = n3;
		}else if(n4<n1 && n4<n2 && n4<n3 && n4<n5){
			menor = n4;
		}else {
			menor = n5;
		}
		
		System.out.println("O maior número digitado é igual a: "+maior);
		System.out.println("O menor número digitado é igual a: "+menor);
		
		//função array.sort
		
	}

}
