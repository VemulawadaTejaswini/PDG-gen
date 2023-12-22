import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] h=new int[n];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
    }
    int sum=0;
    boolean flag=true;
    while(flag){
      flag=false;
      boolean ed=false;
      for(int i=0;i<n;i++){
        if(h[i]!=0){
          h[i]=h[i]-1;
          if(!ed){
            ed=true;
            flag=true;
            sum++;
          }
        }else{
          ed=false;
        }
      }
    }
    System.out.println(sum);
  }
}