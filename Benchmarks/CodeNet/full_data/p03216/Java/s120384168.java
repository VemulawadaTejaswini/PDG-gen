import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int Q = sc.nextInt();
        for (int i=0;i<Q;i++) {
            int k = sc.nextInt();
            int m_cnt = 0;
            int c_cnt = 0;
            long ans = 0L;
            long tmp = 0L;
            for (int j=0;j<k;j++) {
                if (c[j]=='M') m_cnt++;
                if (c[j]=='C') {
                    c_cnt++;
                    tmp += m_cnt;
                }
            }
            for (int j=0;j<N;j++) {
                if (c[j]=='D') {
                    ans += tmp;
                }
                if (c[j]=='M') {
                    m_cnt--;
                    tmp -= c_cnt;
                }
                if (c[j]=='C') c_cnt--;
                if (j+k<N && c[j+k]=='M') m_cnt++;
                if (j+k<N && c[j+k]=='C') {
                    c_cnt++;
                    tmp += m_cnt;
                }
            }
            System.out.println(ans);
        }
    }
}