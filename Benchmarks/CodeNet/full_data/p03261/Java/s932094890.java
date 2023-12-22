import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int I = scan.nextInt();
        String tmp;
        String s = scan.next();
        tmp = s.substring(s.length() - 1);
        for (int i = 0; i < I - 1; i++) {
            s = scan.next();
            if(!s.startsWith(tmp)) {
                System.out.println("No");
                System.exit(0);
            }
            tmp = s.substring(s.length() - 1);
        }
        System.out.println("Yes");
    }
}