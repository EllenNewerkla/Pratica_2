import java.util.Scanner;
import java.util.Random;
public class MyClass 
{
    public static void main(String args[]) 
    {
    int[] array = new int [10];
    Random random = new Random();

    for (int i = 0; i< array.length; i++)
    {
        array[i] = random.nextInt(100);
    }

    for (int i = 0; array.length /2; i++)
    {
        int temp = array[1];
        array[i] = array[array.length - i - 1];
        array[array.length - i - 1] = temp;
    }

        System.out.println("Array revertido: ");
        for(int i = 0; array.length; i++)
        {
            System.out.println(array[i] + " ");
        }
    }
}