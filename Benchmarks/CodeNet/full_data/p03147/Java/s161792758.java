import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h=new int[n];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
    }
    int ans=0;
    for(int i=100;i>0;i--){
      boolean living=false;
      for(int j=0;j<n;j++){
        if(h[j]>=i){
          if(!living){
            living=true;
            ans++;
          }
        }else{
          living=false;
        }
      }
    }
    System.out.println(ans);
  }
}
