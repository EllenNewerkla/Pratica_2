import java.util.Scanner;
import java.util.Random;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Random rand = new Random();
        int[] array = new int[15];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i= 0; i<array.length;i++)
        {
            array[i] = rand.nextInt(100);
            if(array[i] > max)
            {
                max = array[i];
            }
            if(array[i] < min)
            {
                min = array[i];
            }
        }
            System.out.println("O maior número é: " + max);
            System.out.println("O menor número é: " + min);
    }
}