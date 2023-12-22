import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] v = new int[n];
        Map<Integer, Integer> ki = new HashMap<>();
        Map<Integer, Integer> gu = new HashMap<>();
        for(int i=0; i<n; i++) {
            v[i] = Integer.parseInt(sc.next());
            if(i % 2 == 1) {
                if(ki.containsKey(v[i])) ki.put(v[i], ki.get(v[i])+1);
                else ki.put(v[i], 1);
            }else {
                if(gu.containsKey(v[i])) gu.put(v[i], gu.get(v[i])+1);
                else gu.put(v[i], 1);
            }
        }
        ki.put(0, 0);
        gu.put(0, 0);
        int kimax = 0;
        int gumax = 0;
        int kisemax = 0;
        int gusemax = 0;
        for(int key : ki.keySet()) {
            if(ki.get(kimax) < ki.get(key)) kimax = key;
        }
        for(int key : ki.keySet()) {
            if(key == kimax) continue;
            if(ki.get(kisemax) < ki.get(key)) kisemax = key;
        }
        for(int key : gu.keySet()) {
            if(gu.get(gumax) < gu.get(key)) gumax = key;
        }
        for(int key : gu.keySet()) {
            if(key == gumax) continue;
            if(gu.get(gumax) < gu.get(key)) gusemax = key;
        }
        if(kimax == gumax) System.out.println(n - max(ki.get(kimax)+gu.get(gusemax), ki.get(kisemax)+gu.get(gumax)));
        else System.out.println(n - ki.get(kimax) - gu.get(gumax));
        
    }
    public static int min(int a, int b) {
        if(a <= b) return a;
        else return b;
    }
    public static int max(int a, int b) {
        if(a <= b) return b;
        else return a;
    }
}