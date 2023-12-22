import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i += 2) {
            int key = array[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
            
        }
        
        int evencount = -1;
        int evennum = -1;
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            if (val > evencount) {
                evennum = key;
                evencount = val;
            }
        }
        
        map = new HashMap<Integer, Integer>();
        for (int i = 1; i < n; i += 2) {
            int key = array[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
            
        }
        
        int oddcount = -1;
        int oddnum = -1;
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            if (val > oddcount) {
                oddnum = key;
                oddcount = val;
            }
        }
        
        if (evennum == oddnum && evencount == n / 2 && oddcount == n / 2) {
            System.out.println(n/2);
        } else if (evennum == oddnum) {
            System.out.println(Math.min(n/2-
        System.out.println(oddnum);
        
    }
}