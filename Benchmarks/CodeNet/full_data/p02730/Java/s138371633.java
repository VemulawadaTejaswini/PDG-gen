import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        String res = "Yes";
        int len = S.length();
        if(!isPalindrome(S)){
            res = "No";
        }
        if(!isPalindrome(S.substring(0,(len-1)/2))){
            res = "No";
        }
        if(!isPalindrome(S.substring((len+3)/2-1))){
            res = "No";
        }
        System.out.println(res);
    }
    public static boolean isPalindrome(String s){
        boolean res = true;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                res = false;
            }
        }
        return res;
    }
}