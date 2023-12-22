import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static List<Integer>[] edge = new ArrayList[n];
    static boolean[] visit = new boolean[n];
//    static int[] depth

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            edge[i] = new ArrayList<>();
        }




        for (int i=0; i<n-1; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            edge[a].add(b);
            edge[b].add(a);
        }

        int[] ans = new int[n];

        int cnt = 1;

        for (int i=0; i<n; i+=2) {
            ans[i] = cnt++;
        }

        for (int i=1; i<n; i+=2) {
            ans[i] = cnt++;
        }

//        int cnt = 1;
//        for (int i=0; i<n; i++) {
//            for (int v: edge[i]) {
//
//            }
//        }

        for (int i=0; i<n; i++) {
            System.out.print(ans[i]+" ");
        }
//        System.out.print(edge[0]);


    }

    public static void dfs(int v) {

    }

    public class Node {
        int parent;
//        int
    }

}

