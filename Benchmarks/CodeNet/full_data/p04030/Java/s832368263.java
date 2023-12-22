import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = str.length();
        String ans = "";
        
        for(int i=0; i<N; i++){
            if(str.charAt(i) == '0'){
                ans += '0';
                //System.out.println("0:"+ans);
            }else if(str.charAt(i) == '1'){
                ans += '1';
                //System.out.println("1:"+ans);
            }else{
                if(ans.length() != 0){
                    ans = ans.substring(0,ans.length()-1);
                }
                //System.out.println(ans.length()+":"+ans);
            }
        }
        System.out.println(ans);
    }
}
