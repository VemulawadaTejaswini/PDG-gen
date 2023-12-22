import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long H = Long.parseLong(s.next());

        int n = (int) (Math.log(H) / Math.log(2));
        System.out.println((long) Math.pow(2, n) * 2 - 1);
    }
}