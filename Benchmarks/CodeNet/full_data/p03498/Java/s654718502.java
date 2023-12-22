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
        
        int maxabs = -1;
        int maxabs_idx = 0;
        for (int i = 0; i < n; i++) {
            if (Math.abs(array[i]) > maxabs) {
                maxabs = Math.abs(array[i]);
                maxabs_idx = i;
            }
        }
        
        boolean isPositive = false;
        if (array[maxabs_idx] > 0) {
            isPositive = true;
        }
        
        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            int x = maxabs_idx+1;
            int y = i+1;
            
            ans.add(x + " " + y);
        }
        
        if (isPositive) {
            ans.add((maxabs_idx+1) + " " + (0+1));
            for (int i = 0; i < n-1; i++) {
                int x = i+1;
                int y = (i+1)+1;
                
                ans.add(x + " " + y);
            }
        } else {
            ans.add((maxabs_idx+1) + " " + (n-1+1));
            for (int i = n-1; i > 0; i--) {
                int x = i+1;
                int y = (i-1)+1;
                
                ans.add(x + " " + y);
            }
        }
        
        System.out.println(ans.size());
        for (String a : ans) {
            System.out.println(a);
        }
    }
}
