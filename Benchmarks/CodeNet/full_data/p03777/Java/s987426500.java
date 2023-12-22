import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(a b)
        String a = sc.next();
        String b = sc.next();

        boolean honestA = a.equals("H");
        boolean honestB = b.equals("H");
        System.out.println(!(honestA ^ honestB) ? "H" : "D");
        sc.close();
    }
}