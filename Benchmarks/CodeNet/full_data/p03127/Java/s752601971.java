import java.util.*;
import java.util.Map;
import java.util.TreeMap;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        int ans = A[0];
        for(int i=1; i<N; i++){
            int max = Math.max(ans, A[i]);
            int min = Math.min(ans, A[i]);
            while(min!=0){
                if(max%min!=0){
                    int a = min;
                    int b = max % min;
                    max = a;
                    min = b;
                }
                else{
                    ans = min;
                    min = 0;
                }
            }
        }
        System.out.println(ans);
    }
}