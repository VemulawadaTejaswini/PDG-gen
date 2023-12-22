import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long X = sc.nextLong();
        long[] a = new long[N];
        int child = 0;
        int sum = 0;
        for(int i = 0; i < N; i++){
            a[i] = sc.nextLong();
            sum += a[i];
        }
        Arrays.sort(a);
        if(sum >= X){
            for(int i = 0; i < N; i++){
                if(X - a[i] >= 0){
                    X -= a[i];
                    child ++;
                    }
                }
            }else{
                child = N-1;
            }
            
        System.out.println(child);
    }
}
