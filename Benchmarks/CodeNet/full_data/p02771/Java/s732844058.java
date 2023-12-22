import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            int[] Z = new int[10];
            Z[A]++;
            Z[B]++;
            Z[C]++;
            
            for (int i=1;i<=9;i++) {
                if (Z[i]==2) {
                    System.out.println("Yes");
                    return;
                }
            }
            
            System.out.println("No");
        }
    }

}
