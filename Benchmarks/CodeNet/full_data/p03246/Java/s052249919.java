import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int n = nextInt(r);

        int[] A = new int[n/2];
        int[] Ac = new int[n/2];
        int[] B = new int[n/2];
        int[] Bc = new int[n/2];
        for (int i = 0; i < n/2; i++) {
            A[i] = nextInt(r);
            count(A, Ac, i);
            B[i] = nextInt(r);
            count(B, Bc, i);
        }

        int Afi = 0;
        int Asi = 0;
        int Bfi = 0;
        int Bsi = 0;
        if (n > 2) {
            if (Ac[1] > Ac[0]) {
                Afi = 1;
            } else {
                Asi = 1;
            }

            if (Bc[1] > Bc[0]) {
                Bfi = 1;
            } else {
                Bsi = 1;
            }
        }

        for (int i = 2; i < n/2; i++) {
            if (Ac[i] > Ac[Afi]) {
                Asi = Afi;
                Afi = i;
            } else if (Ac[i] > Ac[Asi]) {
                Asi = i;
            }

            if (Bc[i] > Bc[Bfi]) {
                Bsi = Bfi;
                Bfi = i;
            } else if (Bc[i] > Bc[Bsi]) {
                Bsi = i;
            }
        }

        int d = 0;
        if (A[Afi] == B[Bfi] && Asi == 0 && Bsi == 0) {
            d = n/2;
        } else if (A[Afi] == B[Bfi] && Ac[Asi] == 0 && Bc[Bsi] == 0) {
            d = n/2;
        } else if (A[Afi] == B[Bfi]) {
            d = Ac[Asi] > Bc[Bsi] ? Ac[Asi] + Bc[Bfi] : Ac[Afi] + Bc[Bsi];
        } else {
            d = Ac[Afi] + Bc[Bfi];
        }
        System.out.println(n-d);
    }

    public static int nextInt(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            str += (char)c;
        }
        return Integer.parseInt(str);
    }

    public static void sort(int[] T, int i) {
        for (int j = i; j > 0; j--) {
            if (T[j] > T[j-1]) {
                int tmp = T[j-1];
                T[j-1] = T[j];
                T[j] = tmp;
            } else {
                break;
            }
        }
    }

    public static void count(int[] T, int[] C, int i) {
        for (int j = 0; j < i; j++) {
            if (T[j] == T[i]) {
                C[j]++;
                return;
            }
        }
        C[i]++;
    }
}
