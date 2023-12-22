import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        if (Math.sqrt((double)a) + Math.sqrt((double)b) < Math.sqrt((double)c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}