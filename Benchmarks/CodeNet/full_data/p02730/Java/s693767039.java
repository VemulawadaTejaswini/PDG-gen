import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int l = S.length();
        String a = "Yes";
        for(int i = 0; i < l; i++){
            if(S.charAt(i) != S.charAt(l - i - 1)) a = "No";
        }
        for(int i = 0; i < (l-1)/2; i++){
            if(S.charAt(i) != S.charAt((l-1)/2 - i - 1)) a = "No";
        }
        for(int i = (l+3)/2; i < l; i++){
            if(S.charAt(i) != S.charAt(l - i - 1)) a = "No";
        }
        System.out.println(a);
    }
}