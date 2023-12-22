import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int[][] A;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
        }
        System.out.println(N*N*N);



    }

}
