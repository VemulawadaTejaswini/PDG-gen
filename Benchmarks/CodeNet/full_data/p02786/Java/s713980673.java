import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  H = sc.nextLong();

        System.out.println(dfs(H));

    }

    static private long dfs(long h){
        if(h==1) return 1;

        long time = dfs(h/2)*2 + 1;

        return time;
    }


}
