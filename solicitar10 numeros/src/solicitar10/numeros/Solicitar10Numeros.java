package solicitar10.numeros;
import java.util.Scanner;
public class Solicitar10Numeros 
{
    public static void main(String[] args) 
    {
         Scanner leer= new Scanner (System.in);
         int[] denny= new int[10];
         for(int i=0;i<10;i++)
         {
             System.out.println("ingresa el numero #" + (i+1)+ "; ");
             denny[i]=leer.nextFloat();
         }
         for(int a=0;a<10;i++)
         {
             System.out.println("los numeros ingresados son: " +denny[a] );
         }
    }
    
}
