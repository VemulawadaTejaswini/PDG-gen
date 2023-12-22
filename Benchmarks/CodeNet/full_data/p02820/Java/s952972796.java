import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String T = sc.next();
        int[] array = new int[N];
        long result = 0;
        for(int i = 0; i < N; i++){
            char c = T.charAt(i);
            if(c == 'r'){
                if(K <= i && array[i - K] == 'r'){
                    array[i] = '0';
                }else{
                    array[i] = 'r';
                    result += P;
                }
            }
            if(c == 's'){
                if(K <= i && array[i - K] == 's'){
                    array[i] = '0';
                }else{
                    array[i] = 's';
                    result += R;
                }
            }
            if(c == 'p'){
                if(K <= i && array[i - K] == 'p'){
                    array[i] = '0';
                }else{
                    array[i] = 'p';
                    result += S;
                }
            }
        }
        System.out.println(result);
    }
}

