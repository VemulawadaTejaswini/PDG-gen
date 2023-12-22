import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int[] ki=new int[100001];
    int[] gu=new int[100001];
    for(int i=0;i<n;i+=2){
      gu[a[i]]++;
    }
    for(int i=1;i<n;i+=2){
      ki[a[i]]++;
    }
    int kif=0;
    int kis=0;
    int guf=0;
    int gus=0;
    for(int i=0;i<=100000;i++){
      if(ki[i]>ki[kif]){
        kis=kif;
        kif=i;
      }else if(ki[i]>ki[kis]){
        kis=i;
      }
    }
    for(int i=0;i<=100000;i++){
      if(gu[i]>gu[guf]){
        gus=guf;
        guf=i;
      }else if(gu[i]>gu[gus]){
        gus=i;
      }
    }
    if(kif!=guf){
      System.out.println(n-ki[kif]-gu[guf]);
    }else{
      System.out.println(
        Math.min(
          n-ki[kif]-gu[gus],
          n-ki[kis]-gu[guf]
        )
      );
    }
  }
}