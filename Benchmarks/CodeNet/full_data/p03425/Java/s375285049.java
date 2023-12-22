import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    private void solve() {
        int N = sc.nextInt();
        List<String> mList = new ArrayList<String>();
        List<String> aList = new ArrayList<String>();
        List<String> rList = new ArrayList<String>();
        List<String> cList = new ArrayList<String>();
        List<String> hList = new ArrayList<String>();

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            if (name.startsWith("M")) {
                mList.add(name);
            } else if (name.startsWith("A")) {
                aList.add(name);
            } else if (name.startsWith("R")) {
                rList.add(name);
            } else if (name.startsWith("C")) {
                cList.add(name);
            } else if (name.startsWith("H")) {
                hList.add(name);
            }
        }
        long res = 0;
        for (int i = 0; i <= mList.size(); i++) {
            boolean mnz = false;
            if (i != 0) {
                mnz = true;
            }
            for (int j = 0; j <= aList.size(); j++) {
                boolean anz = false;
                if (j != 0) {
                    anz = true;
                }
                for (int k = 0; k <= rList.size(); k++) {
                    boolean rnz = false;
                    if (k != 0) {
                        rnz = true;
                    }
                    for (int k2 = 0; k2 <= cList.size(); k2++) {
                        boolean cnz = false;
                        if (k2 != 0) {
                            cnz = true;
                        }
                        for (int k3 = 0; k3 <= hList.size(); k3++) {
                            boolean hnz = false;
                            if (k3 != 0) {
                                hnz = true;
                            }

                            int cnt = 0;
                            if (mnz) {
                                cnt++;
                            }
                            if (anz) {
                                cnt++;
                            }
                            if (rnz) {
                                cnt++;
                            }
                            if (cnz) {
                                cnt++;
                            }
                            if (hnz) {
                                cnt++;
                            }
                            if (cnt == 3) {
                                res++;
                            }
                            hnz = false;
                        }
                        cnz = false;
                    }
                    rnz = false;
                }
                anz = false;
            }
            mnz = false;
        }
        System.out.println(res);
    }
}