import java.util.Scanner;
import java.util.Random;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Random rand = new Random();
        int[] array = new int[20];
        int sum = 0;
        
        for(int i = 0; i<array.length;i++)
        {
            array[i] = rand.nextInt(100);
            sum += array[i];
        }

        double average = (double) sum / array.length;
        System.out.println("A media é: " + average);
    }
}