import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer>[] set = new HashSet[n];
        for (int i = 0; i < n; i++) {
            set[i] = new HashSet<>();
        }
        
        List<Integer> answer = new ArrayList<Integer>();
        
        for (int i = 0; i < n - 1; i++) {
            int l = sc.nextInt() - 1;
            int m = sc.nextInt() - 1;
            
            int k = 1;
            while (set[l].contains(k) || set[m].contains(k)) {
                k++;
            }
            set[l].add(k);
            set[m].add(k);
            answer.add(k);
        }
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, set[i].size());
        }
        
        System.out.println(max);
        for (Integer color : answer) {
            System.out.println(color);
        }
    }
}
