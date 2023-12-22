import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String T = scan.next();
        scan.close();

        int count = 0;

        for(int i = 0; i < 3; i++) {
            if (S.substring(i, i + 1).equals(T.substring(i, i + 1))) {
                count++;
            }
        }

        System.out.println(count);
    }
}