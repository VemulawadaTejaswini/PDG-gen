import java.util.*;
public class Main {
    public static boolean isPalindrome(String s){
        char[] sc = s.toCharArray();
        for(int i=0;i<sc.length/2;i++){
            if(sc[i] != sc[sc.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S=sc.next();
        int N = S.length();
        if(isPalindrome(S) &
                isPalindrome(S.substring(0, (N-1)/2)) &
                isPalindrome(S.substring((N+3)/2-1, N))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

