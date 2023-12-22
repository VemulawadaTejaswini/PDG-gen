import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        long ans = 0;
        for(int i = 0; i < 11; i++){
            int left = i;
            int right = i+4;
            int chain = 0;
            while(left < len && right <= len){
                if(right - left >= 11){
                    ans += fact(chain);
                    chain = 0;
                    left = right;
                    right += 4;
                    continue;
                }
                long check = Long.parseLong(s.substring(left,right));
                if(check >= 1211412114){
                    ans += fact(chain);
                    chain = 0;
                    left = right;
                    right += 4;
                    continue;
                }
                if(check % 2019 == 0){
                    ans++;
                    chain++;
                    left = right;
                    right += 4;
                }else{
                    ans += fact(chain);
                    chain = 0;
                    right++;
                }
            }
            ans += fact(chain);
        }
        System.out.println(ans);
    }
    
    public static long fact(int f){
        long ret = 0;
        for(int i = 1; i <= f-1; i++){
            ret += i;
        }
        return ret;
    }
}
