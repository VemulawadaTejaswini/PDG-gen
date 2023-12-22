import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int initLen = S.length();

        while (true) {
            int len = S.length();
            S = S.replace("10","").replace("01","");

            if (len == S.length()) {
                break;
            }
        }

        System.out.println(initLen - S.length());
    }

}