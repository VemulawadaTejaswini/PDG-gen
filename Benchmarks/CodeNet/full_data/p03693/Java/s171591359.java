import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int copy=number;
        boolean flag=true;
        while(copy>0)
        {
            if(copy%10==0)
            flag=false;
            copy/=10;
        }
        if(flag)
        {
            if(number<1000&&number>110&&number%4==0)
            System.out.print("YES");
            else
            System.out.print("NO");
        }
    }
}