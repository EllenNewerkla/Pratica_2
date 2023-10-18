import java.util.Scanner;
import java.util.Random;
public class buscaLinear
{
    public static void main(String args[]) 
    {
        int[] randomNumbers = new int[25];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i < randomNumbers.length; i++)
        {
            randomNumbers[i] = (int)
            (Math.random()*100+1);
        }
        System.out.println("Números gerados: ");

        for(int number : randomNumbers)
        {
            System.out.println(number + " ");
        }
        System.out.println("\n Insira um número para verificar se está no array: ");
        int searchNumber = scanner.nextInt();

        boolean found = false;
        for(int number : randomNumbers)
        {
            if(number == searchNumber)
            {
                found = true;
                break;
            }
        }

        if(found)
        {
            System.out.println("O número " + searchNumber + " foi encontrado no array");
        }else{
            System.out.println("O número " + searchNumber + " não foi encontrado no array");
        }
    }
}