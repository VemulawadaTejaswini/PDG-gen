import java.util.*;

public class Main{
    static int count;
    static int N;
    static int n;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        sc.close();
        count = 0;
        dfs("");
        System.out.println(count);
    }
    static void dfs(String s){
        if(s != ""){
            if(Long.valueOf(s) <= N && s.contains("3") && s.contains("5") && s.contains("7")){
                count++;
            }
            if(s.length() < String.valueOf(N).length()){
                dfs(s + "3");
                dfs(s + "5");
                dfs(s + "7");
            }
        } else{
            dfs(s + "3");
            dfs(s + "5");
            dfs(s + "7");
        }
    }
}