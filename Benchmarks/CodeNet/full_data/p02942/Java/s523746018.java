import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    List<Integer>[][] a = new ArrayList[n][n];//段と果ての段
    int[][] b = new int[n][m];
    int[][] c = new int[n][m];
    for(int i=0;i<n*m;i++){
      int d=sc.nextInt();
      if(a[i/m][(d-1)/m]==null){
        a[i/m][(d-1)/m]=new ArrayList(0);
      }
      a[i/m][(d-1)/m].add(d);
    }
    
    for(int i=0;i<m;i++){
      List<Integer> can = new ArrayList<>(n);
      for(int j=0;j<n;j++){can.add(j);}
      for(int j=0;j<n;j++){//縦書き
        for(int k=0;k<can.size();k++){
          if(a[j][can.get(k)]!=null){
            b[j][i]=a[j][can.get(k)].get(0);
            a[j][can.get(k)].remove(0);
            if(a[j][can.get(k)].size()==0){
              a[j][can.get(k)]=null;
            }
            can.remove(k);
            break;
          }
        }
      }
    }
    //表示ｂ
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.println(b[i][j]);
      }
    }
    
    for(int i=0;i<m;i++){
      PriorityQueue<Integer> pq = new PriorityQueue<>(n);
      for(int j=0;j<n;j++){
        pq.add(b[j][i]);
      }
      for(int j=0;j<n;j++){
        c[j][i]=pq.poll();
      }
    }
    
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.println(c[i][j]);
      }
    }
    
  }
}