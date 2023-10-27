import java.util.Scanner;
public class exe01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TAM = 10;
		int i, a[], b[], c[];
		a = new int[TAM];
		b = new int[TAM];
		
		//la�o para ler vetor A
		for(i = 0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"� valor de A:");
			a[i] = sc.nextInt();
			b[i] = a[i]*a[i];
		}
		
		//apresentando o valor A
		System.out.print("A [] = "+"[ ");
		for(i = 0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]\n");
		
		//la�o apresentando b
		System.out.print("B [] = "+"[ ");
		for(i = 0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		
	}

}
