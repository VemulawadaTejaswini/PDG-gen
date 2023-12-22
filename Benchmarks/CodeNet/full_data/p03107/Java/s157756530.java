import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int zero = 0, one = 0, ans = 0;
        for(int i=0;i<n;i++){
            if(s[i]=='0'){
                if(one>0){
                    one--;
                    ans+=2;
                }else{
                    zero++;
                }
            }  else{
                if(zero>0){
                    zero--;
                    ans += 2;
                }else{
                    one++;
                }
            }
        }
        System.out.println(ans);
    }
}