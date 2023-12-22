import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int res = (a*b)/fun(a,b);
        
        System.out.println(res);

    }

    public static int fun(int a, int b) {

        if (a==0) {
            return b;
        } else {
            fun(b%a, a);    
        }
        
        return b;
    }
}
