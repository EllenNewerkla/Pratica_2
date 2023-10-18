import java.util.Scanner;
import java.util.Random;
public class FrequenciaNum
{
    public static void main(String args[]) 
    {
        int[] numeros = new int[50];
        int[] frequencia = new int[11];
        Random random = new Random();

            for(int i=0; i<numeros.length;i++)
            {
                numeros[i] = random.nextInt(10) + 1;

                frequencia[numeros[i]]++;
            }
            for(int i = 1; i < frequencia.length; i++)
            {
                System.out.println(i+ "ocorreu " +frequencia[i] + "vez(es)");
            }
    }
}