import java.util.Scanner;

public class Main {
    public static boolean palindrome(String s) {
        StringBuffer sb = new StringBuffer(s);

        return s.equals(sb.reverse().toString());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (palindrome(s) && palindrome(s.substring(0, (s.length() -1)/2)) && palindrome(s.substring((s.length() + 3)/2 -1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
