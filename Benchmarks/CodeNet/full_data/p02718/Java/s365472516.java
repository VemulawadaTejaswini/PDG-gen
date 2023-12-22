import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int c = 0;
        String ans = "Yes";
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(sc.next());
            sum += A[i];
        }
        int bd = (int)Math.floor(sum / (4 * m));
        for(int i = 0; i < n; i++) {
            if(A[i] >= bd) c++;
        }
        if(c < m) ans = "No";
        System.out.println(ans);
    }
}
