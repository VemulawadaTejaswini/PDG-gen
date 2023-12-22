import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[9];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        List<Integer> B = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            B.add(sc.nextInt());
        }
        if (N < 3) {
            System.out.println("No");
        } else if (B.contains(A[0] ) && B.contains(A[1]) && B.contains(A[2])) {
            System.out.println("Yes");
        } else if (B.contains(A[0] ) && B.contains(A[4]) && B.contains(A[8])) {
            System.out.println("Yes");
        } else if (B.contains(A[0] ) && B.contains(A[3]) && B.contains(A[6])) {
            System.out.println("Yes");
        } else if (B.contains(A[1] ) && B.contains(A[4]) && B.contains(A[7])) {
            System.out.println("Yes");
        } else if (B.contains(A[2] ) && B.contains(A[5]) && B.contains(A[8])) {
            System.out.println("Yes");
        } else if (B.contains(A[2] ) && B.contains(A[4]) && B.contains(A[6])) {
            System.out.println("Yes");
        } else if (B.contains(A[3] ) && B.contains(A[4]) && B.contains(A[5])) {
            System.out.println("Yes");
        } else if (B.contains(A[6] ) && B.contains(A[7]) && B.contains(A[8])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}