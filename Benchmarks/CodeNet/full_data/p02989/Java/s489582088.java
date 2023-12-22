import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] d=new int[n];
		for(int i=0;i<n;i++){
			d[i]=sc.nextInt();
		}
		Arrays.sort(d);
		int p=n/2;
		int q=n/2-1;
		if(d[p]==d[q]){
			System.out.println(0);
		}else{
			System.out.println(d[p]-d[q]);
		}
	}
}