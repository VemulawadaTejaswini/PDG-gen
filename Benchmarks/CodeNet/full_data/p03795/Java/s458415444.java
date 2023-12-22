import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextInt();
        long x = n*800;
        long y = (n/15) * 200;
        System.out.println(x-y);
    }
}
        