import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();


        char[] cs = s.toCharArray();
        cs[k-1] = (char) (cs[k-1] - ('A' - 'a'));
        String ns = new String(cs);
        System.out.print(ns);
    }
}