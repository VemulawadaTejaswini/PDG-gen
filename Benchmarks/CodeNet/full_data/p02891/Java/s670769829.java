import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int k = Integer.parseInt(sc.next());
        
        long ans = 0;
        int x = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                x++;
                if(i == s.length()-1){
                    ans += x/2;
                }
            }else{
                ans += x/2;
                x = 1;
            }
        }
        
        ans *= k;
        
        if(s.length() == 1){
            ans = k/2;
        }
        
        if(s.length() >= 3){
            char c = s.charAt(0);
            if(s.charAt(1) == c && s.charAt(2) == c && s.charAt(s.length()-1) == c
                    && s.charAt(s.length()-2) == c && s.charAt(s.length()-3) == c){
                ans += k-1;
            }else if(s.charAt(1) == c && s.charAt(2) == c && s.charAt(s.length()-1) == c){
                ans += k-1;
            }else if(s.charAt(s.length()-1) == c && s.charAt(s.length()-2) == c && s.charAt(s.length()-3) == c){
                ans += k-1;
            }
        }
        
        System.out.println(ans);
    }
}