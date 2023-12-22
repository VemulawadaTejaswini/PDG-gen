import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int ab = a + b;
        if (ab % 2 != 0) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(ab / 2);
        }
    }
}
