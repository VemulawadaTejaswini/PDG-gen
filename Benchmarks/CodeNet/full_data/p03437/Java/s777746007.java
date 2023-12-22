import java.util,Scanner;
public class Main

{
    public static void main(String arg[])
    {
        int a,b;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        if(a==b)
        System.out.println("-1");
        int c=a>b?a:b;
        c=c+1;
        while(2>1)
        {
            if(c%a==0&&c%b!=0)
            {
            System.out.println(c);
            break;
            }
            c=c+1;
        }
    }
}