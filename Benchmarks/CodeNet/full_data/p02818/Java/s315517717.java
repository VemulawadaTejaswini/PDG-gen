import java.util.*;

class Main
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        
        long total1 = a - k;
        if (total1 >= 0) {
            System.out.println(total1+" "+b);
            return;
        }
        
        long total2 = b + total1;
        if (total2 >= 0) {
            System.out.println(0 + " " + total2);
            return;
        }
        
        System.out.println(0 + " " + 0);
        
        
    }
}
        