import java.io.*;
import java.util.*;
public class Main {
    static String oper;
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chs = s.toCharArray();

        String oper = dfs(chs, 1, chs[0] - '0', "");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chs.length; i++) {
            sb.append(chs[i]);
            if(i < chs.length - 1)
                sb.append(oper.charAt(i));
        }  
        System.out.println(sb.toString() + "=7");
    }
    /*
     1 2 2 2
      ^ 
     cur = 1+2=3+2=7 oper = "+++"
    */
    private static String dfs(char[] chs, int idx, int cur, String opers) {
        if(idx == chs.length) {
            if(cur == 7)
                return opers;
            else return null;
        }
        
        String plus = dfs(chs, idx + 1, cur + (chs[idx] - '0'), opers + "+");
        if(plus != null)
            return plus;
        
        String nega = dfs(chs, idx + 1, cur - (chs[idx] - '0'), opers + "-");
        if(nega != null)
            return nega;
            
        return null;
    }
}