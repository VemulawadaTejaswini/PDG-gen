import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>(N+1);
        ArrayList<ArrayList<Integer>> parents = new ArrayList<>(N+1);
        for(int i = 0; i < N+1; i++) {
            edges.add(new ArrayList<Integer>());
            parents.add(new ArrayList<Integer>());
        }

        int[] incounts = new int[N+1];
        for(int i = 0; i < N - 1 + M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            edges.get(A).add(B);
            incounts[B]++;

            parents.get(B).add(A);
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 1; i < N+1; i++) {
            if (incounts[i] == 0) {
                queue.add(i);
            }
        }

        int[] vertexes = new int[N+1];
        int n = 0;
        while(!queue.isEmpty()) {
            int v = queue.removeFirst();
            vertexes[v] = n;
            n++;
            for(int w: edges.get(v)) {
                incounts[w]--;
                if (incounts[w] == 0) {
                    queue.add(w);
                }
            }
        }

        for(int i = 1; i < N+1; i++) {
            if (vertexes[i] == 0) {
                System.out.println(0);
            } else {
                int parent = -1;
                for(int w: parents.get(i)) {
                    if(parent < 0 || vertexes[w] > vertexes[parent]) {
                        parent = w;
                    }
                }
                System.out.println(parent);
            }
        }
    }
}
