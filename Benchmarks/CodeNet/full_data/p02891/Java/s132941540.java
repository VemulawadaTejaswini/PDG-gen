import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        long n = sc.nextInt();

        char[] c = s.toCharArray();

        long ans = 0;


        if (s.length() == 1) {
            if (n % 2 == 0) {
                System.out.println(n / 2);
                return;
            } else {
                System.out.println(n / 2);
                return;
            }
        } else {
            if (c[0] != c[s.length() - 1]) {
                for (int i = 0; i < s.length() - 1; i++) {
                    if (c[i] == c[i + 1]) {
                        ans++;
                        i++;
                    }
                }
                System.out.println(ans * n);
                return;
            } else {
                if (s.length() % 2 == 0) {
                    for (int i = 0; i < s.length() - 1; i++) {
                        if (c[i] == c[i + 1]) {
                            ans++;
                            i++;
                        }
                    }
                    System.out.println(ans * n);
                    return;
                } else {
                    int cnt = 1;
                    for (int j = 0; j < s.length() - 1; j++) {
                        if (c[j] == c[j + 1]) {
                            cnt++;
                        }
                    }
                    if (cnt != s.length()) {
                        if (n == 1) {
                            for (int i = 0; i < s.length() - 1; i++) {
                                if (c[i] == c[i + 1]) {
                                    ans++;
                                    i++;
                                }
                            }
                            System.out.println(ans);
                            return;
                        } else {
                            for (int i = 0; i < s.length() - 1; i++) {
                                if (c[i] == c[i + 1]) {
                                    ans++;
                                    i++;
                                }
                            }
//                            System.out.println(ans);
                            for (int i = 0; i < s.length() - 1; i++) {
                                if (c[i] == c[i + 1]) {
                                    i++;

                                    if ((c[s.length()-2]!=c[s.length()-1]) && (i==s.length()-1)){
                                        System.out.println(ans*n);
                                        return;
                                    }

                                    if ((c[0] == c[1] && c[1]!=c[2]) && (c[s.length()-3]==c[s.length()-2] && c[s.length()-2]==c[s.length()-1])){
                                        System.out.println(ans * n);
                                        return;
                                    }
                                    if (c[s.length() - 2] == c[s.length() - 1] && ((i == s.length() - 3) || (i == s.length() - 1))) {
                                        System.out.println((long)ans * n);
                                        return;
                                    }else if (c[s.length() - 2] == c[s.length() - 1] && ((i==s.length()-2))){
                                        System.out.println(ans + (ans + 1) * (n - 1));
                                        return;

                                    }
                                }
                            }
                            System.out.println(ans + (ans + 1) * (n - 1));
                            return;
                        }
                    } else {
                        for (int i = 0; i < s.length() - 1; i++) {
                            if (c[i] == c[i + 1]) {
                                ans++;
                                i++;
                            }
                        }
                        System.out.println((long)(((long)s.length()) * n) / (long)2);

                    }
                }
            }
        }
    }
}
