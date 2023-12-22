import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A[] = new int[N];
        int B[] = new int[N];
        int C[] = new int[N];
        int Z[] = new int[N];
        for (int i=0; i<N; i++)
            A[i] = Integer.parseInt(sc.next());
        for (int i=0; i<N; i++)
            B[i] = Integer.parseInt(sc.next());
        sc.close();

        Data[] d = new Data[N];
        for (int i=0; i<N; i++) {
            d[i] = new Data(A[i], B[i]);
        }
        Arrays.sort(d);
        for (int i=0; i<N; i++) {
            A[i] = d[i].getA();
            B[i] = d[i].getB();
        }

        int cnt = N - 2;
        boolean s = false;
        while (cnt>0) {
            int h = jMAX(N, A, C);
            int k = iMAX(N, B, C);
            if (h==k) {
                C[h] = 1;
            } else {
                int l = B[h];
                B[h] = B[k];
                B[k] = l;
                C[h] = 1;
                cnt--;
            }
            if (OK(N, A, B, C)) {
                s = true;
                break;
            }
        }
        if (s) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean OK(int N, int A[], int B[], int C[]) {
        for (int i=0; i<N; i++) {
            if (C[i]==0 && A[i]>B[i])
                return false;
        }
        return true;
    }
    public static int iMAX(int N, int D[], int C[]) {
        int m = 0;
        int j = 0;
        for (int i=0; i<N; i++) {
            if (C[i]==0 && m<D[i]) {
                m = D[i];
                j = i;
            }
        }
        return j;
    }
    public static int jMAX(int N, int D[], int C[]) {
        int m = 0;
        int j = 0;
        for (int i=0; i<N; i++) {
            if (C[i]==0) {
                j = i;
                break;
            }
        }
        return j;
    }

    public static class Data implements Comparable<Data> {
        int a, b;
        public Data(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public int compareTo(Data other) {
            if (this.a == other.a) {
                return other.b - this.b;
            } else {
                return other.a - this.a;
            }
        }
        public int getA() {
            return this.a;
        }
        public int getB() {
            return this.b;
        }
    }
}