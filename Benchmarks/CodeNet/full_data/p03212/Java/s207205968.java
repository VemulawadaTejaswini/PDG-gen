import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static HashSet<Long> dic = new HashSet<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dfs(0,n);
        System.out.println(dic.size());
    }
    static void dfs(long n, long upper){
        if(n>upper) return;
        String N = Long.toString(n);
        if(N.contains("3")&&N.contains("5")&&N.contains("7")) dic.add(n);
        dfs(n*10+3,upper);
        dfs(n*10+5,upper);
        dfs(n*10+7,upper);
    }
}