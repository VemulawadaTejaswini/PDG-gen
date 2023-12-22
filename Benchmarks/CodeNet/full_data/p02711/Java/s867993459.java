import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner ra = new Scanner(System.in);
        String s = ra.next();
        String[] arreglo = s.split("");
        int []arregloenteros = new int [arreglo.length];
        for(int i=0;i<arreglo.length;i++)
        {
            arregloenteros[i] = Integer.parseInt(arreglo[i]);
        }
        boolean estaelsiete=false;
        for(int i=0;i<arreglo.length;i++)
        {
            estaelsiete= arregloenteros[i]==7;
            if(estaelsiete==true)
            {
                System.out.println("Yes");
                break;
            }
        }
        if(estaelsiete==false)
        System.out.print("No");
    }
}