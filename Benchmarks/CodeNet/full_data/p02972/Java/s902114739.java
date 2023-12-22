import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        
        int M = 0;
        for(int i = N-1; i >= 0; i--){
            int sum = 0;
            for(int j = 2*(i+1); j <= N; j++){
                if(a[j-1] == 1)
                    sum++;
            }
            if(sum%2 == 1 && a[i] == 0){
                b[i] = 1;
                M++;
            }
            if(sum%2 == 0 && a[i] == 1){
                b[i] = 1;
                M++;
            }
        }
        System.out.println(M);
        for(int i = 0; i < N; i++){
            if(b[i] == 1){
                System.out.println(i+1);
            }
        }
    }
}