
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int M;
        int[] Pn;
        int[] Xn;
        int[] Yn;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            M = sc.nextInt();
            Pn = new int[N];
            Xn = new int[M];
            Yn = new int[M];
            for(int i =0;i < N;i++){
                Pn[i] = sc.nextInt();
            }
            for(int i =0;i < M;i++){
                Xn[i] = sc.nextInt() -1;
                Yn[i] = sc.nextInt() -1;
            }
        }

        UnionF union = new UnionF(N);
        for(int i =0;i < M;i++){
            union.mergeSet(Xn[i], Yn[i]);
        }
        int result = 0;

        for(int i = N-1;i >= 0;i--){
            int k = union.root(Pn[i]-1);
            int j = union.root(i);
            if(k == j){
                result++;
            }
        }
        System.out.println(result);

    }
    public static class UnionF {
        int[] elements;
        int[] rank;

        public UnionF(int size) {
            this.elements = new int[size];
            this.rank = new int[size];
            for (int i = 0; i < elements.length; i++) {
                elements[i] = i;
                rank[i] = 0;
            }
        }

        public void mergeSet(int x, int y) {
            int i = root(x);

            int j = root(y);

            if (i == j) {
                return;
            }

            if (rank[i] > rank[j]) {
                elements[j] = i;

            } else {
                elements[i] = j;
                if (rank[i] == rank[j]) {
                    rank[i]++;
                }
            }
        }

        public int root(int x) {
            int i = x;
            while (elements[i] != i) {
                i = elements[i];
            }
            int root = i;
            //経路圧縮
            i = x;
            while (elements[i] != i) {
                i = elements[i];
                elements[i] = root;
            }
            return root;
        }

        public boolean isSameSet(int x, int y) {
            int i = root(x);

            int j = root(y);

            return i == j;
        }

        @Override
        public String toString() {
            return this.elements.toString();
        }

    }
}
