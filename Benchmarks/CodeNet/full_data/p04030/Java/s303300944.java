import java.util.*;
public class Main {
    
    static void solve(){
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        for (char ch : sc.next().toCharArray()) {
            int len = s.length();
            if(ch!='B') s.append(ch); 
            else if(len>0) s=new StringBuilder(s.toString().substring(0,len-1));
        }
        System.out.println(s);
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }

}   
