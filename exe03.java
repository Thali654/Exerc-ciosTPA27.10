import java.util.Scanner;
public class exe03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i,vetorA[],vetorB[], j=9;
		
		vetorA = new int [10];
		vetorB = new int [10];
		
		//leitura do vetor A
		for(i = 0; i <10; i++) {
			System.out.println("Entre com o "+(i+1)+"o valor:");
			vetorA[i] = sc.nextInt();
		}
		
		//imprimir vetor B
		for(i = 0; i <10; i++){
			vetorB[j]= vetorA[i];
			j--;
		}
		
		//apresentando o valor b
				System.out.print("B [] = "+"[ ");
				for(i = 0; i<10; i++) {
					System.out.print(vetorB[i]+" ");
				}
				System.out.print("]\n");
		
		
		
	}

}
