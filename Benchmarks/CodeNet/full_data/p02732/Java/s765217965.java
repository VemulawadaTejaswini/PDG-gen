import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N+1];
        for(int i = 0; i <= N; i++){
            b[i] = 0;
        }
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            b[a[i]]++;
        }
        int memory = 0;
        int[] c = new int[N];
        for(int i = 0; i < N; i++){
            memory = b[a[i]];
            b[a[i]]--;
            for(int j = 1; j <= N; j++){
                if(b[j] != 0){
                    c[i] = c[i] + b[j]*(b[j] - 1)/2;
                } 
            }
            System.out.println(c[i]);
            b[a[i]] = memory;
        }
    }
}