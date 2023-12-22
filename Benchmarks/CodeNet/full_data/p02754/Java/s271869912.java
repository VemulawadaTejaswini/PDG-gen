import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double rem = n % (a+b);
        n -= rem;
        System.out.println(String.format("%.0f",n/(a+b)*a + Math.min(rem,a)));
    }
}
