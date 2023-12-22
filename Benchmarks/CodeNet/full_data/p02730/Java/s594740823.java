import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        String s1 = s.substring(0,(n-1)/2);
        String s2 = s.substring(((n+3)/2)-1,n);
        if(checkPalindrome(s) && checkPalindrome(s1) && checkPalindrome(s2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    private static boolean checkPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while (left<=right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
                continue;
            }
            return false;
        }
        return true;
    }
}