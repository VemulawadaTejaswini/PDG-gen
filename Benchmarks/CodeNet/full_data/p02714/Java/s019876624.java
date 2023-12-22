import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
//        out.flush();
        System.out.println(main.solve());
    }
    long solve() throws IOException{
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        long ans = 0;
        Map<Integer,Set<Integer>> map = new HashMap<>();
        int[] arr = new int[n];
        map.put(0,new HashSet<>(n)); map.put(1,new HashSet<>(n));map.put(2,new HashSet<>());
        for(int i=0;i<n;i++){
            if(s[i]=='R') arr[i]=0;
            else if(s[i]=='G') arr[i] = 1;
            else arr[i] = 2;
        }
        for(int j=n-1;j>0;j--){
            for(int i=0;i<j;i++){
                if(arr[i]==arr[j]) continue;
                int target = helper(arr[i],arr[j]);
                Set<Integer> set = map.get(target);
                ans += set.size();
                if(set.contains(2*j-i)) ans -= 1;
            }
            map.get(arr[j]).add(j);
        }
        return ans;
    }
    int helper(int i, int j){
        for(int c=0;c<3;c++){
            if(c==j||c==i) continue;
            return c;
        }
        return 0;
    }
}

