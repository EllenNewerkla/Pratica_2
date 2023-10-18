import java.util.Scanner;
import java.util.Random;
public class MyClass 
{
    public static void main(String args[]) 
    {
        int count = 0;
        int totalRoll = 100;
        for (int i = 0; i < totalRolls; i++)
        {
            int dice1 = (int) (Math.randoom()* 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            int sum = dice1 + dice2;
            if (sum == 7)
            {
                count++;
            }
        }
            System.out.println("A soma de 7 ocorreu " +count+ " vezes." );
    }
}