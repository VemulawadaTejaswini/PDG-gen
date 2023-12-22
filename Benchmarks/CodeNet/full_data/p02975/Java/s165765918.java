import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        int XOR = 0;
        for (int i=0; i<N; i++) {
            XOR ^= Integer.parseInt(sc.next());
        }
        sc.close();

        if (XOR==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}