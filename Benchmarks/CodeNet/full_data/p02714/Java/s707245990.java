import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] sl = sc.next().toCharArray();
        List<Integer> rl = new ArrayList<>();
        List<Integer> gl = new ArrayList<>();
        List<Integer> bl = new ArrayList<>();
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(sl[i] == 'R'){
                rl.add(i);
            }else if(sl[i] == 'G'){
                gl.add(i);
            }else{
                bl.add(i);
            }
        }
        for(int r : rl){
            for(int g : gl){
                for(int b : bl){
                    if(Math.abs(r-g) == Math.abs(g-b) || Math.abs(g-b) == Math.abs(b-r)|| Math.abs(b-r) == Math.abs(r-g)){
                        continue;
                    }
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}