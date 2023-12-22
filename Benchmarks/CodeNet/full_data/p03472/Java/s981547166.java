import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int h = sc.nextInt();
        
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b, Collections.reverseOrder());
        
        int res = 0;
        
        for(int d : b){
            if(d <= a[0]) break;
            
            if(h > 0){
                h-=d;
                res++;
            }
        }
        
        res+=Math.ceil(h/a[0]);
        
        System.out.println(res);
    }
}
