import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int t=700;
        String s=scn.next();
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='o')
                t+=100;
        }
        System.out.println(t);
    }
}
