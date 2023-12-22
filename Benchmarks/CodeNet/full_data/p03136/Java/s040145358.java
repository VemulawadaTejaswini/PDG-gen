import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int l = 0, M = 0, S = 0;
        for (int i = 0; i < N; ++i){
            l = sc.nextInt();
            M = Math.max(M, l);
            S += l;
        }

        System.out.println(2 * M < S ? "Yes" : "No");

        sc.close();
    }
}