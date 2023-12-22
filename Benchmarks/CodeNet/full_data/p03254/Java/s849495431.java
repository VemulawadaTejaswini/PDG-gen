import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),count=0;
    long x=sc.nextLong();
    long[] a=new long[n];
    for(int i=0;i<n;i++)a[i]=sc.nextLong();
    Arrays.sort(a);
    while(x>0) {
    	x-=a[count];
    	if(x>=0)count++;
    	if(count==n) {
    		if(x!=0)count--;
    		break;
    	}
    }
    System.out.println(count);
  }
}
