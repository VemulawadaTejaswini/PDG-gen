import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int p = 0;
		for(int i=0; i<n; i++){
			if(a[i]=='1'){
				p = i;
				break;
			}
		}
		System.out.println((p+1)/(k-1) + (n-p)/(k-1));
	}
}