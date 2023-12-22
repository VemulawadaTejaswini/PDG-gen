import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] c = S.toCharArray();
        int K = sc.nextInt();

        int ans = 0;
        for (int i=0;i<c.length;i++) {
            if (K==1) {
                int a = 9;
                if (i==0) {
                    a = (int)c[i]-48;
                }
                ans += a;
                continue;
            }
            for (int j=i+1;j<c.length;j++) {
                if (K==2) {
                    int a = 9;
                    int b = 9;
                    if (i==0) {
                        a = (int)c[i]-48;
                        if (j==1) {
                            b = (int)c[j]-48;
                        }
                        ans += (a-1)*9;
                        ans += 1*b;
                        continue;
                    }
                    ans += a*b;
                    continue;
                }
                for (int k=j+1;k<c.length;k++) {
                    if (K==3) {
                        int a = 9;
                        int b = 9;
                        int d = 9;
                        if (i==0) {
                            a = (int)c[i]-48;
                            if (j==1) {
                                b = (int)c[j]-48;
                                if (k==2) {
                                    d = (int)c[k]-48;
                                    ans += (a-1)*9*9;
                                    if ((a-1)!=0) ans += 1*Math.max(b-1, 0)*9;
                                    if ((a-1)!=0 && (b-1)!=0) ans += 1*1*d;
                                    continue;
                                }
                            }
                            ans += (a-1)*9*9;
                            if ((a-1)!=0) ans += 1*b*9;
                            continue;
                            // ans += (Math.max(a-1, 0))*9*9;
                            // ans += 1*(Math.max(b-1, 0))*9;
                            // ans += 1*1*d;
                        }
                        ans += a*b*d;
                        continue;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
