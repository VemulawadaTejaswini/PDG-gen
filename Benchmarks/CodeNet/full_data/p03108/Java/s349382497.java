import java.util.Scanner;

public class Main{

    static int[] parent;
    static int[] size;
    static int N,M;
    static int[] A,B;
    static int count;
    static int[] ans;

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt();
      M = sc.nextInt();
      A = new int[M];
      B = new int[M];
      ans = new int[M];
      for(int i=0;i<M;i++){
        A[i]=sc.nextInt();
        B[i]=sc.nextInt();
      }
      UnionFindTree(N);
      ans[0]=N*(N-1)/2;
      for(int i=M-1;i>=1;i--){
          /*union(A[i],B[i]);
          if(same(A[i],B[i])){
            System.out.println(size[A[i]]);
          }
          else{
            System.out.println(size[A[i]]*size[B[i]]);
          }
          */
          count+=size[find(A[i])]*size[find(B[i])];
          if(count<=N*(N-1)/2){
            ans[i]=count;
          //System.out.println(N*(N-1)/2-count);
          union(A[i],B[i]);
        }
        else{
          //System.out.println(N*(N-1)/2);
          ans[i]=N*(N-1)/2;
          union(A[i],B[i]);
        }

      }
      for(int j=1;j<M;j++){
        System.out.println(N*(N-1)/2-ans[j]);
      }
      System.out.println(N*(N-1)/2);
    }

    static void UnionFindTree(int Size) {
        parent = new int[Size+1];
        size = new int[Size+1];

        for (int i = 1; i < Size+1; i++) {
            makeSet(i);
        }
    }

    public static void makeSet(int x) {
        parent[x] = x;
        size[x] = 1;
    }


    public static void union(int x, int y) {
      if(x==y){}
        else{
        final int xRoot = find(x);
        final int yRoot = find(y);


        if (xRoot != yRoot) {
            parent[yRoot] = xRoot;
            size[xRoot]+=size[yRoot];

        }
      }
    }


    public static int find(int x) {
        if (x != parent[x]) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }


    public static boolean same(int x, int y) {
        return find(x) == find(y);
    }
}