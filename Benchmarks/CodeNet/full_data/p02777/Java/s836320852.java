import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("red blue");
        Scanner scan = new Scanner(System.in);
        int red = scan.nextInt();
        int blue = scan.nextInt();
        String input = scan.next();
        if (input.equals("red")) {
            int S = red-1;
            System.out.print(S+" "+blue);
        }
        else {
            int T = blue-1;
            System.out.println(red+" "+T);
        }
    }
}