import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String[] str = s.split("");

        int rightWhite = 0;
        int leftBlack = 0;
        for (int i = 0; i < str.length; i++) {
            if (".".equals(str[i])) {
                rightWhite++;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < str.length; i++) {
            if ("#".equals(str[i])) {
                leftBlack++;
            } else {
                rightWhite--;
            }
            if ((leftBlack + rightWhite) < min) {
                min = leftBlack + rightWhite;
            }
        }
        System.out.println(min);
    }

}
