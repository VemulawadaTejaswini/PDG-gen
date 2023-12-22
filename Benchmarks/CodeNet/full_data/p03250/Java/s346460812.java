import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[3];
        for (int i=0;i < 3 ;i++ ) {
            n[i] = Integer.parseInt(sc.next());
        }
        
        Arrays.sort(n)
        
        int ans = 10*n[2]+n[1]+n[0];
        
        System.out.println(ans);
        
    }
}