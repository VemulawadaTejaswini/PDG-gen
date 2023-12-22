import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    System.out.println(problem145a(r));
}

private static int problem145a(int r) {
    return r * r;
}