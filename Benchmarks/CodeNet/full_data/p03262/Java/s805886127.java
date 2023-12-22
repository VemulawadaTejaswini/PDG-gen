import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),x=sc.nextInt();
    int[] a=new int[n+1];
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    a[n]=x;
    Arrays.sort(a);
    if(n==1) {
    	System.out.println(a[1]-a[0]);
    	System.exit(0);
    }
    int[] b=new int[n];
    for(int i=1;i<n+1;i++) {
    	b[i-1]=a[i]-a[i-1];
    }
    Arrays.sort(b);
    int g=GCD(b[0],b[1]);
    for(int i=2;i<n;i++) {
    	g=GCD(g,b[i]);
    }
    System.out.println(g);
  }
	public static int GCD(int min,int max) {
		if(max%min==0)return min;
		else return GCD(max%min,min);
	}
}
