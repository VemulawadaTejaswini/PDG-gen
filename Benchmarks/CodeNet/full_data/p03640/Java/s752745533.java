import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Stock st=new Stock(a);
    int[][] c=new int[h][w];
    for(int i=0;i<h;i++){
      if(i%2==0){
        for(int j=0;j<w;j++){
          c[i][j]=st.get();
        }
      }else{
        for(int j=w-1;j>=0;j--){
          c[i][j]=st.get();
        }
      }
    }
    for(int i=0;i<h;i++){
      for(int j=0;j<w-1;j++){
        System.out.print(c[i][j]+" ");
      }
      System.out.println(c[i][w-1]);
    }
  }
  static class Stock{
    int[] a;
    int idx=0;
    Stock(int[] a){
      this.a=a;
    }
    int get(){
      if(idx>=a.length){
        return -1;
      }
      int res=idx;
      a[idx]--;
      if(a[idx]==0){
        idx++;
      }
      return res+1;
    }
  }
}