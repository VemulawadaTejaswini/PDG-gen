import java.util.*;
import java.io.*;
class subo
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        long x=s.nextLong();
        long y=s.nextLong();
        if(x%y==0||y%x==0)
        {
            System.out.println("-1");
        }
        System.out.println(x*2);
    }
}