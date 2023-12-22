import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), x = in.nextInt();
        if(a < x && x < a + b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
