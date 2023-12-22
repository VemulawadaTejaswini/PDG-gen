
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> evenmap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> oddmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                int cnt;
                if (evenmap.containsKey(v[i]))
                    cnt = evenmap.get(v[i]) + 1;
                else
                    cnt = 1;

                evenmap.put(v[i], cnt);
            } else {
                int cnt;
                if (oddmap.containsKey(v[i]))
                    cnt = oddmap.get(v[i]) + 1;
                else
                    cnt = 1;

                oddmap.put(v[i], cnt);
            }
        }
        int evmax = 0, evsec = 0, evmaxnum = 0;
        int odmax = 0, odsec = 0, odmaxnum = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                int cnt = evenmap.get(v[i]);
                if (cnt > evmax) {
                    evsec = evmax;
                    evmax = cnt;
                    evmaxnum = v[i];
                } else if (v[i] != evmaxnum && cnt > evsec) {
                    evsec = cnt;
                }
            } else {
                int cnt = oddmap.get(v[i]);
                if (cnt > odmax) {
                    odsec = odmax;
                    odmax = cnt;
                    odmaxnum = v[i];
                } else if (v[i] != odmaxnum && cnt > odsec) {
                    odsec = cnt;
                }
            }
        }
        // ArrayList<Integer> evcnt = new ArrayList<Integer>(evenmap.values());
        // Collections.sort(evcnt, Comparator.reverseOrder());
        // ArrayList<Integer> odcnt = new ArrayList<Integer>(oddmap.values());
        // Collections.sort(odcnt, Comparator.reverseOrder());
        if (evmaxnum != odmaxnum) {
            System.out.println(N - evmax - odmax);
        } else {
            System.out.println(Math.min(N - evmax - odsec, N - evsec - odmax));
        }

    }
}