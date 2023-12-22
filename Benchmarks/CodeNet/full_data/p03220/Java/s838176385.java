import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        
        int[] h = new int[n];
        
        for(int i = 0; i < n; i++) h[i] = sc.nextInt();
        
        int index = 0;
        double diff = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            double j = (double)t - (double)h[i] * 0.006d;
            if(a - Math.abs(j) <= diff){
                diff = Math.abs(a-j);
                index = i+1;
            }
        }
        
        System.out.println(index);
    }
}
