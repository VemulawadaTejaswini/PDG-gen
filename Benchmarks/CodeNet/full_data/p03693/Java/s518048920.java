import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int g = scan.nextInt();
        int b = scan.nextInt();

        int num = r*100 + g*10 + b;

        if(num%4 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("Nox");
        }
    }
}
