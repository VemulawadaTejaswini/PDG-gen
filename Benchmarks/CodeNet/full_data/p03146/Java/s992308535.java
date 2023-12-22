import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); 
        
        Set<Integer> set = new HashSet<>();
        set.add(s);
        
        int ans = 1;
        int before = s;
        set.add(before);
        while(true){
            int x = f(before);
            ans++;
            before = x;
            if( set.contains(before) ){
                break;
            }
            set.add(before);
        }
        
        System.out.println(ans);
    }
    
    static int f(int n){
        if( n % 2 == 0 ) return n/2;
        return 3 * n + 1;
    }
}
