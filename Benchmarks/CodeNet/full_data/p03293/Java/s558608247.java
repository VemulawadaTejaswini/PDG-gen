import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean isMatched = false;
        boolean isYes = false;
        String s = sc.next();
        String t = sc.next();
        int len = s.length();
        char[] s_ = new char[len];
        char[] t_ = new char[len];
        char tmp = 'a';
        
        for(int i=0; i<len; i++){
            s_[i] = s.charAt(i);
            t_[i] = t.charAt(i);
        }
    
        for(int n=0; n<len-1; n++){
            tmp = s_[len];
            for(int i=0; i<len-1; i++){
                s_[i+1] = s_[i];
            }
            s_[0] = tmp;
        
            for(int i=0; i<len; i++){
                if(s_[i] == t_[i]){
                    isMatched = true;
                }else{
                    isMatched = false;
                    break;
                }
            }
            if(isMatched == true){
                isYes = true;
                break;
            }
        }
        
        if(isYes == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}