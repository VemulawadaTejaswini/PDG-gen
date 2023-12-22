import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int Q = sc.nextInt();
        char[] ans = new char[(S.length()) + 2*(Q)];

        for(int i = Q;i<Q+S.length();i++){
            ans[i] = S.charAt(i-Q);
        }
        int headCounter = Q-1;
        int tailCounter = Q+S.length();

        boolean isReversed = false;
        for(int i=0;i<Q;i++){
            int t = sc.nextInt();
            if(t == 1){
                isReversed = !isReversed;

            } else {
                int f = sc.nextInt();
                String C = sc.next();

                if(f == 1){
                    if(isReversed){
                        ans[tailCounter++] = C.charAt(0);
                    } else {
                        ans[headCounter--] = C.charAt(0);

                    }
                } else {
                    if(isReversed){
                        ans[headCounter--] = C.charAt(0);
                    } else {
                        ans[tailCounter++] = C.charAt(0);
                    }
                }
            }

        }
        if(headCounter < 0) headCounter++;
        if(tailCounter > ans.length) tailCounter--;
        StringBuffer sb = new StringBuffer();
        for(int i = headCounter; i <= tailCounter;i++){
            sb.append(ans[i]);

        }

        if(isReversed ){
                System.out.println(sb.reverse());
        } else {
            System.out.println(sb);

        }

    }

}







