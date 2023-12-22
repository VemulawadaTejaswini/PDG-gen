import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n, a, b;
        
        n = sc.nextLong();
        a = sc.nextLong();
        b = sc.nextLong();

        if (a > b){
            System.out.println(0);
            System.exit(0);
        }
      	else if(n==1 && a!=b){
            System.out.println(0);
            System.exit(0);
        }
      	else{
            long length = n - 2;
            System.out.println(length*(b-a)+1);
        }
    }
}
