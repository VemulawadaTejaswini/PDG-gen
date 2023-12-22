import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        int num = Integer.valueOf(a + b);
        int root = (int) Math.sqrt(num);
        if (root*root == num)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
