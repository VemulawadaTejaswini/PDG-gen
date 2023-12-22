import java.util.*;
public class Main{
	static int Train(int[] s, int t){
		int count = 0;
		int x = 0;
      	int y = 0;
		for(int i=0; i<t; i++){
			count++;
			y = s[x];
          	x = y;
			if(x==1)return count;
		}
		return -1;
	}
			

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt() - 1;
		}
		System.out.println(Train(a, n));
	}
}