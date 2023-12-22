import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N;
        int i = 0;
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        while (++i * i <= N)
            ;
        i--;
        System.out.println(i * i);
    }
}