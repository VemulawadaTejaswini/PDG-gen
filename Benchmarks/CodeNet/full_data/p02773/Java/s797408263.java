import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    void solve() throws IOException {
        int n = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String s = sc.next();
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int maxi = 1;
        ArrayList<String> res = new ArrayList<>();
        for(String s:map.keySet()){
            int val = map.get(s);
            if(val<maxi) continue;
            if(val==maxi) res.add(s);
            else{
                maxi = val;
                res.clear(); res.add(s);
            }
        }
        Collections.sort(res);
        for(String s:res) System.out.println(s);
    }
}

