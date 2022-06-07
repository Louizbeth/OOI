import java.util.Scanner;
public class atividade2b{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[10];
        int valor = 0; int posicao1 = 0; int posicao2 = 0;

        while(posicao1 < 10 && valor != -1){
            System.out.println("Digite um valor (-1 para sair):");
            valor = scan.nextInt();
            if(valor != -1){
                vetor[posicao1] = valor;
                posicao1 += 1;
            }

        }
        
        int max = vetor[0];
        int min = vetor[0];

        while(posicao2 < posicao1){
            if(vetor[posicao2] > max){
                max = vetor[posicao2];
            }
            if(vetor[posicao2] < min){
                min = vetor[posicao2];
            }
        }

        System.out.println("Menor numero: "+min);
        System.out.println("Maior numero: "+max);
    }
}