import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String line = sc.next();
        
        int happy = 0;
        for(int i = 0 ; i < N-1; i++){
            if( line.charAt(i) == line.charAt(i+1) ) happy++;
        }
        
        int ans = Math.min(happy + 2 * K ,N-1);
        System.out.println(ans);
    }
}