import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long count=0;
    long[] a=new long[n],b=new long[n],c=new long[n];
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    for(int i=0;i<n;i++)b[i]=sc.nextInt();
    for(int i=0;i<n;i++)c[i]=sc.nextInt();
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);
    for(int i=0;i<n;i++) {
    	int lc=n-B_search(c,b[i]+1);
    	int la=A_search(a,b[i])+1;
    	count+=lc*la;
    	//System.out.println(la+" "+lc);
    }
    System.out.println(count);
  }
  //okはv以上の最小index、ngはv未満の最大index。aに検索対象の配列、vに検索値を入れる。
	public static int B_search(long[] a,long v) {
		int ng=-1,ok=a.length;

		while(Math.abs(ok-ng)>1) {
			int mid=(ok+ng)/2;

			if(a[mid]>=v) ok=mid;
			else ng=mid;
		}
		return ok;
	}
	public static int A_search(long[] a,long v) {
		int ng=-1,ok=a.length;

		while(Math.abs(ok-ng)>1) {
			int mid=(ok+ng)/2;

			if(a[mid]>=v) ok=mid;
			else ng=mid;
		}
		return ng;
	}
}
