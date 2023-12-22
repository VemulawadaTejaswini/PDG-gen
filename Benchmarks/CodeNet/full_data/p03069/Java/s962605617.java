import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();

        int sum2 = 0;
        for (int i = 0; i<N; i++) {
            if (S.charAt(i) == '.') sum2+=1;
            else break;
        }
        int sum3 = 0;
        for (int i = 0; i<N; i++) {
            if (S.charAt(N-i-1) == '#') sum3+=1;
            else break;
        }
        int sum = 0;
        for (int i = sum2; i<N-sum3; i++) {
            if (S.charAt(i) == '.') sum+=1;
        }
        sum = Math.min(sum,N-sum3-sum2-sum);

        int st = sum2;
        int end = N-sum3-1;
        int count = N;
        for (int i = sum2; i<N-sum3; i++) {
            int left = 0;
            int right = 0;
            for (int j = sum2; j < i; j ++) {
                if (S.charAt(j) == '#') left++;
            }
            for (int j = N-sum3-1; i <j; j--) {
                if (S.charAt(j) == '.') right++;
            }
            count = Math.min(count, left + right);
//            System.out.println(count);
        }

        System.out.println(Math.min(sum,count));
    }
}