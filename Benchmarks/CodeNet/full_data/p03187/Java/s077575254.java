import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int N = sc.nextInt();
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }
        int s = 0, e = 1;
        int ans = 0;
        int pos = 0;
        for (int i = 0; i < N; i++) {
            if ((L + X[s] - pos) % L > (L - X[N - e] + pos) % L) {//左回りのがでかい
                ans += (L + X[s] - pos) % L;
                pos = X[s];
                s++;
            } else if ((L + X[s] - pos) % L < (L - X[N - e] + pos) % L) {//右回りのがでかい
                ans += (L - X[N - e] + pos) % L;
                pos = X[N - e];
                e++;
            } else {
                s++;
                e++;
                if ((L + X[s] - pos) % L > (L - X[N - e] + pos) % L) {//左回りのがでかい
                    ans += (L + X[s] - pos) % L;
                    pos = X[s];
                    s++;
                } else if ((L + X[s] - pos) % L < (L - X[N - e] + pos) % L) {//右回りのがでかい
                    ans += (L - X[N - e] + pos) % L;
                    pos = X[N - e];
                    e++;
                } else {

                    s++;
                    e++;
                    if ((L + X[s] - pos) % L > (L - X[N - e] + pos) % L) {//左回りのがでかい
                        ans += (L + X[s] - pos) % L;
                        pos = X[s];
                        s++;
                    } else if ((L + X[s] - pos) % L < (L - X[N - e] + pos) % L) {//右回りのがでかい
                        ans += (L - X[N - e] + pos) % L;
                        pos = X[N - e];
                        e++;
                    } else {

                        s++;
                        e++;
                        if ((L + X[s] - pos) % L > (L - X[N - e] + pos) % L) {//左回りのがでかい
                            ans += (L + X[s] - pos) % L;
                            pos = X[s];
                            s++;
                        } else if ((L + X[s] - pos) % L < (L - X[N - e] + pos) % L) {//右回りのがでかい
                            ans += (L - X[N - e] + pos) % L;
                            pos = X[N - e];
                            e++;
                        } else {

                            s++;
                            e++;
                            if ((L + X[s] - pos) % L > (L - X[N - e] + pos) % L) {//左回りのがでかい
                                ans += (L + X[s] - pos) % L;
                                pos = X[s];
                                s++;
                            } else if ((L + X[s] - pos) % L < (L - X[N - e] + pos) % L) {//右回りのがでかい
                                ans += (L - X[N - e] + pos) % L;
                                pos = X[N - e];
                                e++;
                            } else {

                                s++;
                                e++;
                                if ((L + X[s] - pos) % L > (L - X[N - e] + pos) % L) {//左回りのがでかい
                                    ans += (L + X[s] - pos) % L;
                                    pos = X[s];
                                    s++;
                                } else if ((L + X[s] - pos) % L < (L - X[N - e] + pos) % L) {//右回りのがでかい
                                    ans += (L - X[N - e] + pos) % L;
                                    pos = X[N - e];
                                    e++;
                                } else {

                                    s++;
                                    e++;
                                    if ((L + X[s] - pos) % L > (L - X[N - e] + pos) % L) {//左回りのがでかい
                                        ans += (L + X[s] - pos) % L;
                                        pos = X[s];
                                        s++;
                                    } else if ((L + X[s] - pos) % L < (L - X[N - e] + pos) % L) {//右回りのがでかい
                                        ans += (L - X[N - e] + pos) % L;
                                        pos = X[N - e];
                                        e++;
                                    } else {

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}