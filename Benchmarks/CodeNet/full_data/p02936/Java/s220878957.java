import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int a, b, p, x;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n-1; i++){
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            map.put(b, a);
        }
        
        int[] count = new int[n];
        for(int i = 0; i < q; i++){
            p = Integer.parseInt(sc.next());
            x = Integer.parseInt(sc.next());
            count[p-1] += x;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(count[0]).append(" ");
        for(int i = 1; i < n; i++){
            count[i] += count[map.get(i+1) - 1];
            sb.append(count[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}