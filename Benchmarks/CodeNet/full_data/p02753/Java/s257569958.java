import java.util.Scanner;

public class Main {
    static int n;
    static String s;
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
        s = sc.next();
        System.out.println(s.contains("A")&&s.contains("B")?"Yes":"No");
    }
}