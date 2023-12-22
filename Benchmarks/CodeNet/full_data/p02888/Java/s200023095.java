import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int N = sc.nextInt();
        int[] L = new int[N];
        for(int i = 0; i < N; i++) L[i] = Integer.parseInt(sc.next());
        Arrays.sort(L);
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
               for(int k = j + 1; k < N; k++) if(L[i] + L[j] > L[k]) res++;
               else break;
            }
        }
        System.out.println(res);
    }
}
