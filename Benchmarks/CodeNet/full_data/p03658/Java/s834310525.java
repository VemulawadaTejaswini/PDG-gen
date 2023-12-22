import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int result = 0;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer stick[] = new Integer[n];
        
        for (int i=0; i < n; i++){
            stick[i] = sc.nextInt();
        }
            
        Arrays.sort(stick,Collections.reverseOrder());
        
        int sum = 0;
        
        for (int i=0; i < k; i++){
            sum += stick[i];
        }
        
        System.out.println(sum);
        
        sc.close();
    }
}