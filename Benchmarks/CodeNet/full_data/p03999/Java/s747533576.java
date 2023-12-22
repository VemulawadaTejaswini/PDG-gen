import java.util.*;
class Main {
    static char[] c;
    static long total;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        c = str.toCharArray();
        dfs(0, 0, c[0]-'0');
        System.out.println(total);
    }
    public static void dfs(int depth, long sum, long carry) {
        if(depth+1 == c.length) {
            System.err.println(depth+" "+sum+" "+carry);
            total += sum+carry;
            return;
        }
        System.err.println(sum);
        dfs(depth+1, sum+carry, (long)(c[depth+1]-'0'));
        dfs(depth+1, sum, carry*10+(long)(c[depth+1]-'0'));
    }
}