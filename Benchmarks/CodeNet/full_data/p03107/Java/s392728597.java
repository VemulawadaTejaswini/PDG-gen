import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int one = 0;
        int zero = 0;
        
        for(int i = 0; i < N; i++){
            if(S.charAt(i) == '1'){
                one++;
            }
        }
        for(int i = 0; i < N; i++){
            if(S.charAt(i) == '0'){
                zero++;
            }
        }
        System.out.println(one < zero ? one * 2 : zero * 2);
    }
}
