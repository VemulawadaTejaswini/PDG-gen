import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long[] a=new long[n];
    long sum=0,h=0;
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextLong();
    	sum+=a[i];
    }
    for(int i=0;i<n;i++) {
    	h+=a[i];
    	if(h==sum/2) {
    		System.out.println(0);
    		System.exit(0);
    	}else if(h>sum/2) {
    		break;
    	}
    }
    System.out.println(sum-h);
  }
}
