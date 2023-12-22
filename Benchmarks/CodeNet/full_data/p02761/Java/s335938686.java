import java.util.*;

public class Main{
  public static void main(String[] args){
    boolean flg=true;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=new int[m];
    int[] b=new int[m];
    int[] c=new int[n];
    for(int i=0;i<m;i++){
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      c[i]=-1;
    }
    for(int i=0;i<m;i++){
      if(a[i]==1 && b[i]==0){
        flg=false;
        break;
      }else if(c[a[i]-1]!=-1 && c[a[i]-1]!=b[i]){
        flg=false;
        break;
      }else{
        c[a[i]-1]=b[i];
      }
    }
    for(int i=0;i<n;i++){
      if(c[i]==-1){
        c[i]=0;
      }
    }
    if(flg){
      for(int i=0;i<n;i++){
        System.out.print(c[i]);
      }
      System.out.println("");
    }else{
      System.out.println(-1);
    }
  }
}