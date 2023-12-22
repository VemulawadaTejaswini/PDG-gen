import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int len = S.length();
        String s1 = S.substring(0, len/2);
        String s2 = "";
        if (len % 2 == 0) {
         s2 = new StringBuffer(S.substring(len/2, len)).reverse().toString();
        }else {
            s2 =   new StringBuffer(S.substring(len/2 +1, len)).reverse().toString();
        }
        if (!s1.equals(s2)) {
            System.out.println("No");
            return;
        }
        String s3 = S.substring(0, (len-1)/2);
        if (!s3.equals(new StringBuffer(s3).reverse().toString())) {
            System.out.println("No");
            return;
        }

        String s4 = S.substring((len+3)/2 -1);
        if (!s4.equals(new StringBuffer(s4).reverse().toString())) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
