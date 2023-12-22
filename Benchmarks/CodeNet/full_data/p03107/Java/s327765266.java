import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String copy = s;
        while (!copy.matches("0*|1*")) {
            copy = copy.replaceAll("01|10", "");
        }
        System.out.println(s.length() - copy.length());
        sc.close();
    }
}