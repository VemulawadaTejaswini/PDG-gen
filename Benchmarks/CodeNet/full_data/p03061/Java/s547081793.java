import java.util.*;
import java.io.*;

public class Main {

    static int gcd(int a, int b){
        if(b == 0){ return a; }
        return gcd(b, a%b);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            a.add(Integer.parseInt(sc.next()));
        }
        
        if(n < 3){
            out.println(Collections.max(a));
            out.flush();
            return;
        }
        
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        
        left.add(a.get(0));
        right.add(a.get(n-1));
        
        for(int i = 1; i < n; i++){
            if(left.get(i-1) > a.get(i)){
                left.add(gcd(left.get(i-1), a.get(i)));
            } else {
                left.add(gcd(a.get(i), left.get(i-1)));
            }
            if(right.get(i-1) > a.get(n-1-i)){
                right.add(gcd(right.get(i-1), a.get(n-1-i)));
            } else {
                right.add(gcd(a.get(n-1-i), right.get(i-1)));
            }
        }
        Collections.reverse(right);
        
        ArrayList<Integer> g = new ArrayList<>();
        g.add(left.get(n-2));
        g.add(right.get(1));
        
        for(int i = 1; i < n-1; i++){
            int l = left.get(i-1);
            int r = right.get(i+1);
            if(l > r){
                g.add(gcd(l, r));
            } else {
                g.add(gcd(r, l));
            }
        }
        out.println(Collections.max(g));
        
        out.flush();
    }
}
