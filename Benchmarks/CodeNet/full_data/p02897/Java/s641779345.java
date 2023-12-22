import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = N/2;
        if (N % 2 == 1) {
            m+=1;
        }
        double ans = (double) m/N;
        System.out.println(String.format("%.10f",ans));
    }
}