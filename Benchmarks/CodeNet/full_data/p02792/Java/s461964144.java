import java.util.*;

public class Main {

    static long pow(long a,int n) {
        long res=1;
        while (n>0) {
            if ((n-n/2*2)==1) {
                res=res*a;
            }
            a=a*a;
            n>>=1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 0;
        for (int i=1;i<=N;i++) {
            String S = String.valueOf(i);
            int left = (int)S.charAt(0)-48;
            int right = (int)S.charAt(S.length()-1)-48;
            if (right==0) continue;
            if (left==right && N>=right) ans++;
            // if (left!=right) {
                // if (i==105) System.out.println("KKKKKKKKKKKKKK");
                // if (i==106) System.out.println("KKKKKKKKKKKKKK");
                for (int j=1;j<10;j++) {
                    long tmp = (long)right*pow(10, j)+left;
                    long nine_nine = pow(10, j)-10;
                    // System.out.println("i "+i);
                    // System.out.println(tmp+" "+(tmp+nine_nine));
                    // if (N>=tmp+nine_nine) {
                    if (N<tmp) {
                        long add = j==1?0:pow(10, j-2);
                        // ans += pow(10, j-1);
                        ans += add;
                        // System.out.println("i, add_N<tmp "+i+" "+add);
                        break;
                    } else if (tmp<=N && N<tmp+nine_nine) {
                        ans += j==1?0:pow(10, j-2);
                        ans += ((N-tmp)/10);
                        // System.out.println("i, tmp<=N "+i+" "+((N-tmp)/10));
                        // System.out.println("ans+ " + (N-tmp)/10);
                        String N_str = String.valueOf(N);
                        // System.out.println((int)N_str.charAt(N_str.length()-1)-48);
                        // if ((int)N_str.charAt(N_str.length()-1)-48>=left) ans++;
                        ans++;
                        break;
                    }
                    if (j>=2) ans += pow(10, j-2);
                }
            // } else { // left==right
            // }
            // System.out.println(left+" "+right);
        }
        System.out.println(ans);
    }
}