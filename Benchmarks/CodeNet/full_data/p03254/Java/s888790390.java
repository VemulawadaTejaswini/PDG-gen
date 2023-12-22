import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        long x = sc.nextLong();
        long[] a = new long[n];
        
        for(int i = 0; i < n; i++) a[i] = sc.nextLong();
        
        Arrays.sort(a);
        
        int res = 0;
        
        for(int i = 0; i < n; i++){
            if(x - a[i] >= 0){
                res++;
                x-=a[i];
            }
        }
        
        if(x > 0 && res >= 1){
            res--;
        }
        
        System.out.println(res);
    }
}
