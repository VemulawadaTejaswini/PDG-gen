import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String a = s.substring(0, (s.length()-1)/2);
        String b = s.substring(((s.length()+3)/2)-1);
        String ans = "Yes";
        int cnt = (int)Math.floor(a.length()/2);
        int flg = 1;
        
        for(int i=0; i<Math.floor(s.length()/2); i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                ans = "No";
                flg = 0;
                break;
            }
        }
        
        if(flg==1){
            for(int i=0; i<cnt; i++){
                if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                    ans = "No";
                    break;
                }
                if(b.charAt(i)!=b.charAt(b.length()-1-i)){
                    ans = "No";
                    break;
                }
            }
        }
        
        System.out.println(ans);
    }
}