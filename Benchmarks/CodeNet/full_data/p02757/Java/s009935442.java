import java.util.*;

class Main{
    Main(){
        Scanner SC = new Scanner(System.in);

        int N = Integer.parseInt(SC.next());
        int P = Integer.parseInt(SC.next());
        String S = SC.next();

        int[] RED, RED_DIGIT;

        RED = new int[N];
        for(int i=0;i<N;i++){
            RED[i] = (S.charAt(i) - '0') % P;
        }

        RED_DIGIT = new int[N];
        RED_DIGIT[0] = 1;
        for(int i=1;i<N;i++){
            RED_DIGIT[i] = 10 * RED_DIGIT[i-1] % P;
        }

        long R = 0, T;
        for(int l=0;l<N;l++){
            T = 0;
            for(int r=l;r>=0;r--){
                T = (T + RED[r] * RED_DIGIT[l-r]) % P;
                if(T == 0) R++;
            }
        }

        System.out.println(R);
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
