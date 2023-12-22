import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        long sum = stdin.next().chars().mapToLong(c -> c == '+' ? 1 : -1).sum();
        System.out.println(Long.toString(sum));
    }
}