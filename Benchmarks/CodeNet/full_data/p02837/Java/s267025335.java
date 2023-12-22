import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    E[][] e=new E[n][];
    for(int i=0;i<n;i++){
      int a=sc.nextInt();
      e[i]=new E[a];
      for(int j=0;j<a;j++){
        e[i][j]=new E(sc.nextInt()-1,sc.nextInt());
      }
    }
    int max=0;
    for(int i=0;i<1<<n;i++){
      boolean katei=true;
      for(int j=0;j<n;j++){
        if((i>>j&1)==1){
          for(int k=0;k<e[j].length;k++){
            if((i>>e[j][k].i&1)!=e[j][k].h){
              katei=false;
              break;
            }
          }
          if(!katei){
            break;
          }
        }
      }
      if(katei){
        int cnt=0;
        for(int j=0;j<n;j++){
          if((i>>j&1)==1){
            cnt++;
          }
        }
        max=Math.max(cnt,max);
      }
    }
    System.out.println(max);
  }
  static class E{
    int i;
    int h;
    E(int i,int h){
      this.i=i;
      this.h=h;
    }
  }
}