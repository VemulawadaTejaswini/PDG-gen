import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        Pair[] p = new Pair[n];
        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(sc.next());
            int l = Integer.parseInt(sc.next());
            p[i] = new Pair(x-l, x+l);
        }
        
        Arrays.sort(p);
        int ans = 0;
        int right = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(p[i].left < right) continue;
            ans++;
            right = p[i].right;
        }
        
        System.out.println(ans);
    }
    
    static class Pair implements Comparable<Pair>{
        int left;
        int right;
        
        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
        
        @Override
        public int compareTo(Pair s) {
            
            if(this.right > s.right){
                return 1;
            }else{
                return -1;
            }
        }
    }
}