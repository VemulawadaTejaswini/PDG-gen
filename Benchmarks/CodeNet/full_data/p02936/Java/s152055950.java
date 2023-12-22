import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int parent[] = new int[n];
        int node[] = new int[n];

        for (int i=0; i<n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            parent[b] = a;
        }

        for (int i=0; i<q; i++){
            node[sc.nextInt()-1] += sc.nextInt();
        }

        for (int i=1; i<n; i++){
            node[i] += node[parent[i]];
        }

        for (int i=0; i<n; i++){
            System.out.print(node[i]+" ");
        }

    }
}