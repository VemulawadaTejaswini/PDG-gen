import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int fn = 1;
        int bn = 1;
        int max = 0;
        int m = 0;
        char[] fs = new char[N];
        char[] bs = new char[N];
        int[] f = new int[N];
        int[] b = new int[N];

        for(int i=0; i<N-1; i++){
            fn = 1;
            bn = 1;
            m = 0;
            for(int j=1; j<=i; j++){
                int xf = 0;
                for(int k=0; k<j; k++){
                    if(j!=k){
                        if(S.charAt(k)!=S.charAt(j)){
                            xf += 1;
                        }
                    }
                }
                if(xf==j){
                    fn += 1;
                    fs[j] = S.charAt(j);
                    f[j] = j;
                }
            }

            for(int j=i+2; j<=N-1; j++){
                int xf = 0;
                for(int k=i+1; k<j; k++){
                    if(j!=k){
                        if(S.charAt(k)!=S.charAt(j)){
                            xf += 1;
                        }
                    }
                }
                if(xf==j-i-1){
                    bn += 1;
                    bs[j] = S.charAt(j);
                    b[j] = j;
                }
            }
            fs[0] = S.charAt(0);
            bs[i+1] = S.charAt(i+1);
            f[0] = 0;
            b[i+1] = i+1; 
            for(int j=0; j<=i; j++){
                for(int k=i+1; k<N; k++){
                    if(bs[k]==fs[j] && f[j]==j && b[k]==k){
                        m += 1;
                    }
                }
            }
            max = Math.max(max, m);
        }
        System.out.println(max);
    }
}