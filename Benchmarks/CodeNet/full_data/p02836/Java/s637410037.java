import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int length = S.length();
        int cnt = 0;
        for(int i = 0; i < length / 2; i++){
            if(S.charAt(i) != S.charAt(length - i - 1)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
