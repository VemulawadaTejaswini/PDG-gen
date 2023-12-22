import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] ns = new int[n];
        for (int i = 0; i < q; i++) {
            ns[sc.nextInt() - 1]++;
        }

        for (int i : ns) {
            if ((k - (q - i)) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
