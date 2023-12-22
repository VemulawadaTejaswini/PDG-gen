import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Integer[] l=new Integer[n];
    for(int i=0;i<n;i++){
      l[i]=sc.nextInt();
    }
    Arrays.sort(l);
    long ans=0;
    for(int i=0;i<n-2;i++){
      for(int j=i+1;j<n-1;j++){
        int ok=j;
        int ng=n;
        while(ng-ok>1){
          int gaze=ok+(ng-ok)/2;
          if(l[gaze]<l[i]+l[j]){
            ok=gaze;
          }else{
            ng=gaze;
          }
        }
        ans=ans+(ok-j);
      }
    }
    System.out.println(ans);
  }
}