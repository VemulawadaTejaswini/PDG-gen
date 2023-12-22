import java.util.Scanner;

public class Main {
    Main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println(Math.abs((n - 2) * (m - 2)));
    }

    public static void main (String[] args) {
        new Main();
    }

}
