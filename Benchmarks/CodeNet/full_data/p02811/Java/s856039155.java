import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        System.out.println((k * 500) >= x ? "Yes" : "No");
    }
}
