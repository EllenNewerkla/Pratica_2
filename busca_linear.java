import java.util.Random;
import java.util.Scanner;

public class busca_linear {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean encontrado = false;


        int[] numeros = new int[25];
        for (int i = 0; i < 25; i++) {
            numeros[i] = random.nextInt(100); 
        }

        System.out.print("Qual número você busca no array?: ");
        int numbusc = scanner.nextInt();


        for (int numero : numeros) {
            if (numero == numbusc) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(numbusc + " está no array.");
        } else {
            System.out.println(numbusc + " não está no array.");
        }
    }
}