import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] size; // size of subtree, including self
    List<Integer>[] graph;
    long[] dp,ans;
    final long mod = 1000000000+7;
    long[] frac,inv; // inv[i] = the inversion of i! mod M
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
        out.flush();
//        System.out.println(main.solve());
    }
    long solve() throws IOException{
        int k = sc.nextInt();
        if(k<=12) {
            out.println(k);
            return k;
        }
        List<Node> curr = new ArrayList<>(), next = new ArrayList<>();
        for(int i=1;i<=9;i++){
            curr.add(new Node(i));
        }
        Set<Node> used = new HashSet<>();
        Node res = new Node(233);
        int cnt = 0;
        while(cnt < k){
            for(Node n:curr){
                cnt += 1;
                if(cnt==k){
                    res = n;
                    break;
                } else{
                    used.add(n);
                    for(int i=-1;i<=1;i++){
                        if(n.val+i>=0&&n.val+i<=9){
                            Node temp = new Node(n.val+i);
                            temp.prev = n;
                            next.add(temp);
                        }
                    }
                }
            }
            if(cnt<k){
                curr = next; next = new ArrayList<>();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(res!=null){
            sb.append(res.val);
            res = res.prev;
        }
        out.println(sb.reverse().toString());
        return 0;

    }
    class Node{
        int val; Node prev;
        public Node(int x){
            val = x;
        }
    }
}

