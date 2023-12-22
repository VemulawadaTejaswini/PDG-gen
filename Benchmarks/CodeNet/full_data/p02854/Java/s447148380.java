import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long[] a=new long[n];
    double sum=0.0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
      sum+=a[i];
    }
    long x=0;
    long y=0;
    for(int i=0;i<n;i++){
      y+=a[i];
      if(y>sum/2.0){
        x=y-a[i];
        break;
      }else if(y==sum/2.0){
        System.out.println(0);
        System.exit(0);
      }
    }
    if((sum/2.0-x)==(y-sum/2.0)){
      System.out.println(sum/2.0-x);
    }else if((sum/2.0-x)<(y-sum/2.0)){
      for(int i=1;i<n;i++){
        x++;
        sum++;
        if(x==sum/2.0){
          System.out.println(i);
          break;
        }
      }
    }else{
      for(int i=1;i<n;i++){
        y--;
        sum--;
        if(y==sum/2.0){
          System.out.println(i);
          break;
        }
      }
    }
  }
}