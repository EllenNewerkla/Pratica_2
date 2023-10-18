import java.util.Scanner;
import java.util.Random;
public class main
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();

        int[] aleatorio = new int[10];
        for(int c=0; c<=9;c++)
        {
            aleatorio[c] = rand.nextInt(100);
        }
        for(int c=0; c<=9;c++)
        {
            if(aleatorio[c]%2 == 0)
            {
                System.out.printIn(aleatorio[c]);
            }
        }
    }
}