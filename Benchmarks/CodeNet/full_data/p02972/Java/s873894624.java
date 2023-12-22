import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N + 1];
        for(int i=1; i<=N; i++){
            a[i] = sc.nextInt();
        }
        int M = 0;
        int[] b = new int[N + 1];

        for(int i=N; i>0; i--){
            if(i*2>N){
                if(a[i]==1){
                    b[M] = i;
                    M += 1;
                }
            }
            else{
                int sum = 0;
                for(int j=2; j<=N/i; j++){
                    sum += a[j * i];
                }
                if(sum%2!=a[i]){
                    b[M] = i;
                    M += 1;
                }
            }
        }
        System.out.println(M);
        if(M==0){
            return;
        }
        System.out.print(b[0]);
        for(int i=1; i<M; i++){
            System.out.print(" " + b[i]);
        }
        System.out.println("");
    }
}