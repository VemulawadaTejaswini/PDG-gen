import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int c=0;
        for(int i=1; i<S.length(); i++){
            if(S.charAt(i)!=S.charAt(i-1))c++;
        }
        System.out.println(c);
    }
}