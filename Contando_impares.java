import java.util.Scanner;
import java.util.Random;
public class MyClass 
{
    public static void main(String args[]) 
    {
        int[] array = new int[30];
        int countOdds = 0;
        Random random = new Random();

        for(int i = 0; i<array.length;i++)
        {
            if(array[i] % 2!= 0)
            {
                countOdds++;
            }
        }
            System.out.println("Numero de impares no array: " + countOdds);
    }
}