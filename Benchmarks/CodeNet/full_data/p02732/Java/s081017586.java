import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[N];
        int j = 0;
        while(j < N){
            int count = 0;
            for(int k = 0; k < N; k++){
                for(int l = k + 1; l < N; l++){
                    if(j != k && j != l){
                        if(a[l] == a[k]) count++;
                    }
                }
            }
            b[j] = count;
            j++;
        }
        for(int i = 0; i < N; i++){
            System.out.println(b[i]);
        }
    }
}