import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static long ans=0;
    public static void main(String[] args) throws IOException {

        Scanner s= new Scanner(new BufferedInputStream(System.in));
        String str = s.nextLine();

        dfs(0,0,str);
        System.out.println(ans);
    }

    /**
     *  递归拆分的逻辑
     */
    public static void dfs(long sum, int index,String s) {
        if (index == s.length()) {
            ans += sum;
            return;
        }
        for (int i = index + 1; i <= s.length(); i++) {
            dfs(sum + Long.parseLong(s.substring(index, i)), i, s);
        }
    }
}