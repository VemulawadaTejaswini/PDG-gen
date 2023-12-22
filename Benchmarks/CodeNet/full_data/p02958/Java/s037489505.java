import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p[] = new int[N];
        for (int i = 0, i < N, i++) {
            p[i] = sc.nextInt();
        }
        int c = 0;
        for (int j = 1, j < N, j++) {
            if (p[j] - p[j-1] != 1) {
                c++;
            }
        }
         if (N == 2 || c == 2 || c == 0) {
             System.out.println("YES");
         } else if(p[0] == 1 && p[N] == N && c == 3) {
             System.out.println("YES");
         } else {
             System.out.println("NO");
        }
    }
}