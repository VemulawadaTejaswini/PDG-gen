import java.util.Scanner;

public class Main { public static void main(String...args) {
    Scanner sc = new Scanner(System.in); int N = sc.nextInt(); int M = sc.nextInt();
    System.out.println(N * (N - 1) / 2 + M * (M - 1) / 2);}
}