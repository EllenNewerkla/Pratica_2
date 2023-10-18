import java.util.Scanner;
import java.util.Random;
public class MyClass {
    public static void main(String args[]) {
       Random rand = new Random();
        int numAle = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int palpite;

        do{

        System.out.print("Adivinhe o numero de 1 a 100: ");
        palpite = scanner.nextInt();

        if (palpite > numAle)
        {
            System.out.println("Muito alto");

        }else if (palpite < numAle)
        {
            System.out.println("Muito baixo!");

        }else
        {
            System.out.println("ACERTOU!");

        }

        }while(palpite != numAle);
        scanner.close();
    }
}