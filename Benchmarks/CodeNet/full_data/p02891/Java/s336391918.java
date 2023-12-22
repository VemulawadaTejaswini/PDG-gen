import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

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
//                    System.out.println(cnt);
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
                            for (int i = 0; i < s.length() - 1; i++) {
                                if (c[i] == c[i + 1]) {
                                    i++;
                                    if (c[s.length() - 2] == c[s.length() - 1] && i == s.length() - 3) {
                                        System.out.println(ans * n);
                                        return;
                                    } else {
                                        System.out.println(ans + (ans + 1) * (n - 1));
                                        return;
                                    }
                                }else {
                                    for (int q = 0; q < s.length() - 1; q++) {
                                        if (c[q] == c[q + 1]) {
                                            ans++;
                                            q++;
                                        }
                                    }
                                    System.out.println(ans + (ans + 1) * (n - 1));
                                    return;


                                }

                            }
                        }
                    } else {
                        for (int i = 0; i < s.length() - 1; i++) {
                            if (c[i] == c[i + 1]) {
                                ans++;
                                i++;
                            }
                        }
                        System.out.println(((s.length()) * n) / 2);

                    }
                }
            }
        }
    }
}
