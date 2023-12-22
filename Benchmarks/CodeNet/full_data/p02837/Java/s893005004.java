import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        Map<Integer, int[][]> xy = new HashMap<>();
        for(int i=1; i<=n; i++) {
            a[i] = Integer.parseInt(sc.next());
            int[][] x = new int[a[i]][2];
            for(int j=0; j<a[i]; j++) {
                x[j][0] = Integer.parseInt(sc.next());
                x[j][1] = Integer.parseInt(sc.next());
            }
            xy.put(i, x);
        }
        
        int max = 0;
        for(int x=0; x<Math.pow(2,n); x++) {
            boolean hantei = true;
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for(int y=0; y<n; y++) {
                if((1&x>>y)==1) {
                    count++;
                    for(int i=0; i<a[y+1]; i++) {
                        if(map.containsKey(y+1)) {
                            if(map.get(y+1) == 0) {
                                hantei = false;
                                break;
                            }
                        }else {
                            map.put(y+1, 1); 
                        }
                        if(map.containsKey(xy.get(y+1)[i][0])) {
                            if(map.get(xy.get(y+1)[i][0]) != xy.get(y+1)[i][1]) {
                                hantei = false;
                                break;
                            }
                        }else {
                            map.put(xy.get(y+1)[i][0], xy.get(y+1)[i][1]); 
                        }
                    }
                }else {
                    if(map.containsKey(y+1)) {
                        if(map.get(y+1) == 1) {
                            hantei = false;
                            break;
                        }
                    }else {
                        map.put(y+1, 0); 
                    }
                }
                if(hantei == false) break;
            }
            if(hantei) {
                if(max < count) max = count;
            }
                
        }
        System.out.println(max);
        
    }
    
    public static int min(int a, int b) {
        if(a <= b) return a;
        else return b;
    }
    static int sa(int a, int c) {
        if(a <= c) return c-a;
        else return a-c;
    }
}