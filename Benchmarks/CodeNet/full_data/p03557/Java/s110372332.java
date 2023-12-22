import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n],b = new int[n],c = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scanner.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i] = scanner.nextInt();
		}
		for(int i=0;i<n;i++){
			c[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		long sum = 0;
		for(int i=0;i<n;i++){
			long t = searchSmallValue(a,b[i]);
			long u = searchBigValue(c,b[i]);
			if(u == 0){
				u = n - 1;
			}else{
				u = n - u;
			}
			sum += u * t;
		}
		System.out.println(sum);
	}
	public static int searchSmallValue(int[]x , int y){
		int lowid = 0;
		int highid = x.length;
		while(lowid < highid){
			int midid = (lowid + highid) / 2;
			if(x[midid] == y && midid > 0 && x[midid-1] != y){
				return midid;
			}else if(y <= x[midid]){
				highid = midid;
			}else{
				lowid = midid + 1;
			}
	    }
		return lowid;


	}

	public static int searchBigValue(int []x , int y){
		int lowid = 0;
		int highid = x.length;
		while(lowid < highid){
			int midid = (lowid + highid) / 2;
			if(x[midid] == y && midid < highid -1 && x[midid+1] != y){
				return midid;
			}else if(y < x[midid]){
				highid = midid;
			}else{
				lowid = midid + 1;
			}
	    }
		return lowid;
	}

}
