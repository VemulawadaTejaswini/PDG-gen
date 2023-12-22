import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String... args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            int[] vecV=new int[n];
            int[] vecC=new int[n];
            int mayor=0;
            for(i=0;i<n;i++)
                vecV[i]=scan.nextInt();
            for(i=0;i<n;i++)
                vecC[i]=scan.nextInt();
            int[] sumas=new int[n*n];
            for(i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    int aux=(vecV[i]+vecV[j])-(vecC[i]+vecC[j]);
                    if(sumas[i]<aux)
                        sumas[i]=aux;
                }
            }
            Arrays.sort(sumas);
            for(i=0;i<sumas.length;i++)
            {
                if(mayor<sumas[i])
                    mayor=sumas[i];
            }
            System.out.println(mayor);
        }
    }
}
    