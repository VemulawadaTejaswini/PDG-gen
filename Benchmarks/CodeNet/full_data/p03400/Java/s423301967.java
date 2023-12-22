import java.util.*;

class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        
        Integer[] ary = new Integer[n];
        for(int i = 0; i < n; ++i) {
            int tmp = Integer.parseInt(sc.next());
            ary[i] = tmp;
        }
        
        int j = 0;
        int sum = 0;
        
        for(int i = 1; i < n + 1; ++i) {
            while(d - (j * ary[i-1] + 1) >= 0) {
                ++sum;
                ++j;
            }
            j = 0;
        }
        
        int ans = sum + x;
        System.out.println(ans);
     }
}