import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main (String...args) {
        Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int a = sc.nextInt(); int b = sc.nextInt();
        System.out.println((n/(a+b))*a + Math.min(a,n%(a+b)));}
}