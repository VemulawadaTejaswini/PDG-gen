import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Integer d[] = new Integer[N];
        
        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }
        
        Arrays.sort(d, Comparator.reverseOrder());
        
        int a = 0;
        int cnt = 0;
        
        for (int i = 0; i < N; i++) {
            if (a != d[i]) {
                cnt++;
            }
            a = d[i];
        }
        
        System.out.println(cnt);
    }
}