import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
public class Main {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int three = N/3;
    ArrayList<Integer>[] edge  = new ArrayList[N];
    for(int i = 0; i < N; i++){
      edge[i] = new ArrayList<>();
    }
    while(sc.hasNext()) {
      int from = sc.nextInt()-1;
      int to = sc.nextInt()-1;
      edge[from].add(to);
      edge[to].add(from);
    }
    int ans[] = new int[N];
    int depth[] = new int[N];
    depth[0] = 1;
    int ki, gu;
    ki = gu = 0;
    ArrayDeque<Integer> adq = new ArrayDeque<>();
    adq.add(0);
    while(adq.size()>0){
      int now = adq.pollFirst();
      if(depth[now]==1){
        gu++;
      } else {
        ki++;
      }
      for(int next : edge[now]){
        if(depth[next]==0){
          depth[next] = -depth[now];
          adq.addLast(next);
        }
      }
    }
    int k, l, m;
    k = l = 0;
    m = 1;
    if(ki<=three){
      for(int i=0;i<N;i++){
        if(depth[i]==-1) {
          ans[i]=3*m;
          m++;
        } else {
          if(3*k+1<=N){
            ans[i]=3*k+1;
            k++;
          } else if(3*l+2<=N){
            ans[i]=3*l+2;
            l++;
          } else {
            ans[i]=3*m;
            m++;
          }
        }
      }
    }
    else if(gu<=three){
      for(int i=0;i<N;i++){
        if(depth[i]==1) {
          ans[i]=3*m;
          check[ans[i]-1]=true;
          m++;
        } else {
          if(3*k+1<=N){
            ans[i]=3*k+1;
            k++;
          } else if(3*l+2<=N){
            ans[i]=3*l+2;
            l++;
          } else {
            ans[i]=3*m;
            m++;
          }
        }
      }
    }
    else {
      for(int i=0;i<N;i++){
        if(depth[i]==-1) {
          if(3*k+1<=N){
            ans[i]=3*k+1;
            k++;
          } else {
            ans[i]=3*m;
            m++;
          }
          check[ans[i]-1]=true;
        }
        else if(depth[i]==1){
          if(3*l+2<=N){
            ans[i]=3*l+2;
            l++;
          } else {
            ans[i]=3*m;
            m++;
          }
          check[ans[i]-1]=true;
        }
      }
    }
    int c = 0;
    for(int i=0;i<N;i++){
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