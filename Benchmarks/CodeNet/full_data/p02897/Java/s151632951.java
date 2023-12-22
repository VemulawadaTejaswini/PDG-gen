import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double r = (Math.floor(n/2.0)+(n%2==0?0:1)) / n;
        System.out.println(r);
    }
}
