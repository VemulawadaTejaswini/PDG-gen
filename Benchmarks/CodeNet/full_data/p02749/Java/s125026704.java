import java.util.Scanner;
public class Main {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int three = N/3;
    int tree[] = new int[N];
    int from, to;
    int ki, gu, both;
    ki = gu = both = 0;
    while(sc.hasNext()){
      from = sc.nextInt();
      to = sc.nextInt();
      if(tree[from-1]==2){
        if(tree[to-1]==0){
          tree[to-1] = 1;
          ki++;
        } else if(tree[to-1]==2){
          tree[to-1] = 3;
          ki--;
          both++;
        }
      } else if(tree[from-1]==1){
        if(tree[to-1]==0){
          tree[to-1] = 2;
          gu++;
        } else if(tree[to-1]==1){
          tree[to-1] = 3;
          gu--;
          both++;
        }
      } else if(tree[from-1]==0){
        tree[from-1]=2;
        gu++;
        if(tree[to-1]==0){
          tree[to-1] = 1;
          ki++;
        } else if(tree[to-1]==2){
          tree[to-1] = 3;
          ki--;
          both++;
        }
      } else {
        tree[to-1] = 3;
        both++;
      }
    }
    int ans[] = new int[N];
    boolean check[] = new boolean[N];
    int k, l, m;
    k = l = 0;
    m = 1;
    if(both>three){
      System.out.println(-1);
      return;
    }
    if(ki+both<three){
      for(int i=0;i<N;i++){
        if(tree[i]==1||tree[i]==3) {
            ans[i]=3*m;
            check[ans[i]-1]=true;
            m++;
        }
      }
    }
    else if(gu+both<three){
      for(int i=0;i<N;i++){
        if(tree[i]==2||tree[i]==3) {
            ans[i]=3*m;
            check[ans[i]-1]=true;
            m++;
        }
      }
    }
    else if(three<ki&&three<gu){
      for(int i=0;i<N;i++){
        if(tree[i]==1&&k<three) {
          ans[i]=3*k+1;
          check[ans[i]-1]=true;
          k++;
        }
        else if(tree[i]==2&&l<three){
          ans[i]=3*l+2;
          check[ans[i]-1]=true;
          l++;
        }
      }
    }
    int c = 0;
    for(int i=0;i<N;i++){
      System.err.print(tree[i]);
      if(ans[i]!=0){
        System.out.print(ans[i]+" ");
      } else {
        while(check[c]){ 
          c++;
        }
        System.out.print((c+1)+" ");
        c++;
      }
    }
  }
}