import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        String s = sc.next();
        int i = 0, len = s.length();
        StringBuilder sb = new StringBuilder();
        String temp = "BC";
        while(i<len){
            if(i<len-1&&s.substring(i,i+2).equals(temp)){
                sb.append("D");
                i += 2;
            } else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        long ans = help(sb.toString().toCharArray());
        System.out.println(ans);
    }
    static long help(char[] sb){
        int i=0,len = sb.length;
        long ans = 0;
        while(i<len){
            if(sb[i]=='B'||sb[i]=='C') i++;
            else{
                int j = i+1;
                while(j<len&&(sb[j]=='A'||sb[j]=='D')) j++;
                long temp = 0, A = 0;
                for(int idx=i;idx<j;idx++){
                    if(sb[idx]=='A') A++;
                    else temp += A;
                }
                ans += temp;
                i = j;
            }
        }
        return ans;
    }
}

