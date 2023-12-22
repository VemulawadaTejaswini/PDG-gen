import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();

        if (N % 2 != 0) {
            System.out.println("No");
        }
        else {
            int n1 = N / 2;
            String s1 = str.substring(0, n1);
            String s2 = str.substring(n1);
            if (s1.equals(s2)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}