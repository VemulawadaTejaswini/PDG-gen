import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n=sc.nextInt(),count=0;
    long[] l=new long[(int)n];
    for(int i=0;i<n;i++)l[i]=sc.nextInt();
    Arrays.sort(l);
    for(int i=0;i<n-2;i++) {
    	for(int j=i+1;j<n-1;j++) {
    		long buff=B_search(l,l[i]+l[j]);
			count+=Math.max(buff-j-1,0);
    	}
    }
    System.out.println(count);
  }
  //okはv以上の最小index、ngはv未満の最大index。aに検索対象の配列、vに検索値を入れる。
	public static long B_search(long[] a,long v) {
		int ng=-1,ok=a.length;

		while(Math.abs(ok-ng)>1) {
			int mid=(ok+ng)/2;

			if(a[mid]>=v) ok=mid;
			else ng=mid;
		}
		return ok;
	}
}
