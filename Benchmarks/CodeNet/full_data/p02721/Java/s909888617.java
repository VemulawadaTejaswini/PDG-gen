import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = sc.nextInt();
        String S = sc.next();
        boolean[] sche = new boolean[N];
        for (int i = 0; i < N; i++) {
            if(S.toCharArray()[i] == 'o'){
                sche[i] = true;
            }
        }

        int[] left = new int[N];
        int[] right= new int[N];

        int count = 0;

        int lcount =0;
        for (int i = 0; i < N; i++) {
            if(sche[i]){
                left[i] = ++lcount;
                i+=C;
            }
            if(lcount==K) break;
        }
        int rcount =0;
        for (int i = N-1; i >= 0; i--) {
            if(sche[i]){
                right[i] = K-rcount;
                ++rcount;
                i-=C;
            }
            if(rcount==K) break;
        }


        for (int i = 0; i < N ; i++) {
            if(left[i]==right[i] && right[i]!=0){
                System.out.println(i+1);
            }
            
        }

    }

}
