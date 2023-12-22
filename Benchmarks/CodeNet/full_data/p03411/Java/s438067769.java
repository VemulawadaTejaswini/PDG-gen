import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
        int[] c = new int[n];
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            c[i] = Integer.parseInt(sc.next());
            d[i] = Integer.parseInt(sc.next());
        }
        
        Pair[] blue = new Pair[n];
        for(int i = 0; i < n; i++){
            blue[i] = new Pair(0, new ArrayList<>());
            for(int j = 0; j < n; j++){
                if(a[j] < c[i] && b[j] < d[i]){
                    blue[i].a++;
                    blue[i].b.add(j);
                }
            }
        }
        Arrays.sort(blue);
        
        boolean[] red = new boolean[n];
        Arrays.fill(red, true);
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < blue[i].a; j++){
                int x = blue[i].b.get(j);
                if(red[x]){
                    red[x] = false;
                    count++;
                    break;
                }
            }
        }
        
        System.out.println(count);
    }
    
    static class Pair implements Comparable<Pair>{
        int a;
        List<Integer> b;
        
        public Pair(int a, List<Integer> b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public int compareTo(Pair s) {
            
            if(this.a > s.a){
                return 1;
            }else if(this.a < s.a){
                return -1;
            }else{
                return 0;
            }
        }
    }
}