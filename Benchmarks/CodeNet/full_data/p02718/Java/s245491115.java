import java.util.Scanner;
import java.util.ArrayList;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();

        int N = sc.nextInt();
        int M = sc.nextInt();
        for (int i = 0; i < N; i++) {
            al.add(sc.nextInt());
        }

        for (int j = 0; j < M; j++) {
            if (al.get(j) == (1/4*M)) {
                System.out.println("Yes");
            }
            
            else {
                System.out.println("No");
            }
        }
    }
}
