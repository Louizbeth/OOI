import java.util.Scanner;

public class atividade2a {
    public static void main(String[] args) {
        int cont = 0;
        int i = 0;
        int j = 1;
        int tamanho = 2500;

        for (i = 0; i < tamanho; i++) {
            if (i % 2 == 0) {
                System.out.println(i+" - par!");
            } else {
                System.out.println(i+" - impar!");
            }
            cont = 0;
            for(j = 1; j < tamanho; j++){
                if(i%j == 0){
                    cont++;
                }
            }
            if(cont == 2){
                System.out.println(i+" - primo!");
            }
            cont = 0;
            
        }
    }
}