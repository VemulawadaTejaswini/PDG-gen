import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        String ans = "YES";
        Arrays.sort(A);
        int tmp = 0;
        for (int i = 0; i < N; i++) {
            if(tmp == A[i]){
                ans = "NO";
                break;
            }else{
                tmp = A[i];
            }
        }

        System.out.println(ans);
    }
}
