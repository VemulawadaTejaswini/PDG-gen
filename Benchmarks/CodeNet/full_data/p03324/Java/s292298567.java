import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();
        int N = in.nextInt();
        double d = Math.pow(100,D);
        int a = (int)d;
        if(a == 1)
            N++;
        System.out.println(a * N);
    }
}