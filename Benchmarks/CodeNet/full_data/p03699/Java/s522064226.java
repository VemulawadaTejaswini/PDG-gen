import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] s = new int[N];
        int sum = 0;
        for(int i=0; i<N; i++) {
            s[i] = Integer.parseInt(sc.next());
            sum += s[i];
        }
        Arrays.sort(s);
        
        if(sum % 10 == 0) {
            for(int i=0; i<N; i++) {
                if((sum-s[i]) % 10 != 0) {
                    sum -= s[i];
                    break;
                }
            }
        }
        
        System.out.println(sum);
    }
    
}