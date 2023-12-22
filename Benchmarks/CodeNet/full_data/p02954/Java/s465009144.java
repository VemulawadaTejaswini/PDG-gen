import java.util.*;



public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();

        int point =0;
        int rCount =0;
        int lCount =0;
        boolean rCounting = true;
        int[] ans = new int[S.length];
        for(int i=0;i<S.length;i++){

            if(i>0 && S[i] == 'R' && S[i-1] == 'L'){
                ans[point-1] = (rCount +1)/2 + lCount/2;
                ans[point] = (lCount+1)/2 + rCount/2;
                rCounting = true;
                rCount = 1;
                lCount = 0;

            } else if(i>0 && S[i] == 'L' && S[i-1] == 'R'){
                point = i;
                rCounting = false;
                lCount = 1;


            } else {
                if(rCounting){
                    rCount++;
                } else {
                    lCount++;
                }

            }

            if(i == S.length-1) {
                ans[point] = (rCount +1)/2 + lCount/2;
                ans[point-1] = (lCount+1)/2 + rCount/2;
            }

        }

        for(int a: ans){
            System.out.print(a + " ");

        }


    }

}


