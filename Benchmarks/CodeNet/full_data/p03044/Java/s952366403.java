import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class UnionFind{
    int N;
    int[] par;

    public UnionFind(int _N){
      N = _N;
      par = new int[N];
      for(int i = 0; i < N; i++){
          par[i] = i;
      }
    }

    public int root(int x){
      if(par[x] == x) return x;
      return par[x] = root(par[x]);
    }

    public void unite(int x, int y){
      int rx = root(x);
      int ry = root(y);
      if(rx == ry) return;
      par[ry] = rx;
    }

    public boolean same(int x, int y){
      int rx = root(x);
      int ry = root(y);
      return rx == ry;
    }
}

class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int tied = -1;
      UnionFind uf = new UnionFind(N);
      for(int i = 0; i < N - 1; i++){
          int u = sc.nextInt();
          int v = sc.nextInt();
          int w = sc.nextInt();
	  if(u < v){
	      int tmp = v;
	      v = u;
	      u = tmp;
	  }
          if(w%2 == 0){
	      tied = u - 1;
              uf.unite(u - 1,v - 1);
          }
      }
      //ルートを整理
      for(int i = 0; i < N; i++){
	  uf.root(i);
      }

      for(int i = 0; i < N; i++){
	  if(uf.root(i) == 0 || uf.root(i) == tied){
	      System.out.println("0");
	  }
	  else{
	      System.out.println("1");
	  }
      }
    }
}
