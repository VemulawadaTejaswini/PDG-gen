import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.next());
        int opt = 0;
        boolean check = true;
        for(int i=0;i<S.length();i++){
         if(S.charAt(i)!=S.charAt(S.length()-i-1)){
             check = false;
             break;
         }
        }
        if(check)opt++;
        int num = (S.length()-1)/2;
        StringBuilder s = new StringBuilder(S.substring(0,num));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                check = false;
                break;
            }
        }
        if(check)opt++;
        num = (S.length()+3)/2;
        s = new StringBuilder(S.substring(num-1));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                check = false;
                break;
            }
        }
        if(check)opt++;
        if(opt==3) System.out.println("Yes");
        else System.out.println("No");
    }
}