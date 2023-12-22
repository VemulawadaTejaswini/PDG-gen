import java.util.*;

class  Main
{
     public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long y=sc.nextLong();
        if( (x+y)%3==0)
            System.out.println("POSSIBLE");
        else
            System.out.println("IMPOSSIBLE");
    }
}