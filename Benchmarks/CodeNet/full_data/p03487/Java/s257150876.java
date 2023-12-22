import java.util.*;

class Main{
  public static void main(String[] args){
    int n=sc.nextInt();
    int[] m=new int[1000000001];
    for(int i=0;i<n;i++){
      m[sc.nextInt()]++;
    }
    int sum=0;
    for(int i=1;i<=1000000000;i++){
      if(m[i]>=i){
        sum+=i-m[i];
      }else{
        sum+=m[i];
      }
    }
    System.out.println(sum);
  }
}