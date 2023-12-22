import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int initLen = S.length();

        int zero = S.replace("1", "").length();
        int one = S.replace("0","").length();
        System.out.println(S.length() -  Math.abs(zero - one));

    }

}
