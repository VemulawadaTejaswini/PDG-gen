
import java.util.Scanner;
public class MAIN {


    public static void main(String[] args) {
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        if(b%a==0)
    {
        System.out.println(a+b);
        System.out.println("As "+a+"is a divisor of "+b);
    }
else
    System.out.println(b-a);
    }
    
}
