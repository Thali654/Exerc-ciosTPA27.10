import java.util.Scanner;
public class exe04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
				float valor,soma=0, mediaVetor;
				int i,vetorA[];
				
				vetorA = new int [10];
				
				//leitura do vetor A
				for(i = 0; i <10; i++) {
					System.out.println("Entre com o "+(i+1)+"o valor:");
					vetorA[i] = sc.nextInt();
				}
				
				//calculo
				for(i = 0; i <10; i++) {
					valor = vetorA[i];
					soma = soma+valor;
				}
				
				//media
				mediaVetor = soma/10;
				
				//Apresentando a média
				System.out.println("A média dos dez valores apresentados é "+mediaVetor);
				
	}
	
}
