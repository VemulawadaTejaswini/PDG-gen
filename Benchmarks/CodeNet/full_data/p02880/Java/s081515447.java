import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i,j = 0;

        for(i = 1; i < 10; i++) {
            for(j = 1; j < 10; j++) {
                int nij = i * j;
                if (N == nij) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
    }
}