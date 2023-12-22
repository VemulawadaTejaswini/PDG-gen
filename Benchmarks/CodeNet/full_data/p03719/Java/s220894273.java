import java.util.*;

class A {
    public static void main(final String[] args) {
        var sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(A <= C & C <= B ? "YES" : "NO");
        sc.close();
    }
}