import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long[] a=new long[4],b=new long[4];
    long sum=0;
    for(int i=0;i<4;i++){
      a[i]=sc.nextLong();
    }
    long n=sc.nextLong(),min=1000000000;
    b[0]=a[0]*8;
    b[1]=a[1]*4;
    b[2]=a[2]*2;
    b[3]=a[3];
    int f=0;
    
    for(int i=0;i<3;i++){
      min=(long)Math.min(min,b[i]);
    }
    if(b[f]>=b[3]){
      for(int i=0;i<n/2;i++){
        sum+=a[3];
      }
      if(n%2==1){
        sum+=min/2;
      }
    }else{
      for(int i=0;i<n;i++){
        sum+=min/2;
      }
    }
    System.out.println(sum);
  }
}
