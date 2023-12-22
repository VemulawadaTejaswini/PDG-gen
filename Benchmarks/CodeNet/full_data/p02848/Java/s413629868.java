import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner laptm = new Scanner(System.in);
        int n = laptm.nextInt();
        String s = laptm.next();
        char[] arreglochar = s.toCharArray();
        for(int i=0;i<arreglochar.length;i++)
        {
           if(arreglochar[i]+n>90)
           {
               arreglochar[i]=(char)(arreglochar[i]-26+n);
           }
           else
           arreglochar[i]+=n;
           }
        for(int i=0; i<arreglochar.length;i++)
        System.out.print(arreglochar[i]);
    }
}