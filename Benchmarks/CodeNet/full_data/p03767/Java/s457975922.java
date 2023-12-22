import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt();
    long[] a=new long[3*n];
    long sum=0;
    for(int i=0;i<3*n;i++){
      a[i]=sc.nextLong();
    }
    Arrays.sort(a);
    for(int i=n;i<2*n;i++){
      sum+=a[i];
    }
    System.out.println(sum);
  }
}
