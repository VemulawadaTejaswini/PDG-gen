import java.util.*;

public class Main {
    static int[] a;
    static boolean res;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        a = new int[4];
        
        for(int i = 0; i < 4; i++) a[i] = sc.nextInt();
        
        dfs("");
        
        System.out.println(res ? "YES" : "NO");
        
    }
    
    public static void dfs(String current){
        if(res){
            return;
        }
        
        if(current.length() == 4){
            if(current.equals("1974")){
                res = true;
            }
            return;
        }
        
        dfs(current + a[0]);
        dfs(current + a[1]);
        dfs(current + a[2]);
        dfs(current + a[3]);
        
    }
}
