import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        char[] s = sc.next().toCharArray();
        boolean[] front = new boolean[n];
        boolean[] back = new boolean[n];
        int ind = s.length-1;
        int cnt = 0;
        while(ind >= 0 && cnt < k){
            if(s[ind] == 'o'){
                front[ind] = true;
                ind -= c+1;
                cnt++;
            }else{
                ind -= 1;
            }
        }
        ind = 0;
        cnt = 0;
        while(ind < s.length && cnt < k){
            if(s[ind] == 'o'){
                back[ind] = true;
                ind += c+1;
                cnt++;
            }else{
                ind += 1;
            }
        }
        for(int i = 0; i < n; i++){
            if(front[i] && back[i]){
                System.out.println(i+1);
            }
        }
    }

}
