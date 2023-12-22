import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] a = new int[N];
        int child = 0;
        int sum = 0;
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
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
            }else if(a[0] > X){
                   child = 0;
            }else{
                child = N-1;
            }
            
        System.out.println(child);
    }
}
