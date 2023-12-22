import java.util.*;

public class Main {
    static int n;
    static PriorityQueue<List<Integer>> que = new PriorityQueue<>();
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        String str = "";
        dfs(0, str, 0);
        
        
    }
    
    public static void dfs(int x, String str, int count) {
        char c = (char)(x + 'a');
        str += c;
        count++;
        if (count == n) {
            System.out.println(str);
            return;
        }
        
        for (int i = 0; i <= x + 1; i++) {
            dfs(i, str, count);
        }
    }
}
