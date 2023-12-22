import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        int result = 0;
        char prev = S.charAt(0);
        char firstC = prev;
        int leftIndexTmp = 1;
        boolean leftSame = true;
        
        for(int i = 1; i < N; i++){
            char now = S.charAt(i);
            if(leftSame && firstC == now){
                leftIndexTmp++;
            }else{
                leftSame = false;
            }
            if(prev == now){
                if(prev == 'R'){
                    result++;
                }
                if(now == 'L'){
                    result++;
                }
            }
            prev = now;
        }
        int leftIndex = 0;
        int rightIndex = N - 1;
        if(S.charAt(0) == S.charAt(N - 1)){
            char targetC = S.charAt(0);
            while(S.charAt(leftIndex) == targetC){
                leftIndex++;
            }
            while(S.charAt(rightIndex) == targetC){
                rightIndex--;
            }
        }else{
            rightIndex = N - 2;
            char lastC = S.charAt(N - 1);
            for(int i = N - 2; i >= 0; i--){
                if(S.charAt(i) == lastC){
                    rightIndex--;
                }else{
                    break;
                }
            }
            leftIndex = leftIndexTmp > (N - rightIndex - 1) ? leftIndexTmp : 0;
            rightIndex = leftIndexTmp > (N - rightIndex - 1) ? N - 1 : rightIndex;
        }
        int nowC = S.charAt(leftIndex);
        int count = 0;
        while(count < K){
            while(leftIndex < N && S.charAt(leftIndex) != nowC){
                leftIndex++;
            }
            while(rightIndex >= 0 && S.charAt(rightIndex) != nowC){
                rightIndex--;
            }
            if(leftIndex < rightIndex){
                count++;
            }else{
                break;
            }
            nowC = nowC == 'R' ? 'L' : 'R';
        }
        // 最後に残った区間が全て同じ文字であれば -1
        char searchC = S.charAt(leftIndex);
        int minus = 1;
        for(int i = leftIndex; i <= rightIndex; i++){
            if(searchC != S.charAt(i)){
                minus = 0;
                break;
            }
        }
        if(leftIndex >= rightIndex){
            minus = 0;
        }
        System.out.println(result + (count * 2) - minus);
    }
}
