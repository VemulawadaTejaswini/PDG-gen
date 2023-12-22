import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ai = sc.nextLine();
		String[] bi = sc.nextLine();
		String[] ci = sc.nextLine();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n-1];
		int sum = 0;
		
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(ai[i]);
		}
		
		for(int i = 0; i < n; i++){
			b[i] = Integer.parseInt(bi[i]);
		}
		
		for(int i = 0; i < n-1; i++){
			c[i] = Integer.parseInt(ci[i]);
		}
		
		for(int i = 0; i < n; i++){
			sum += b[a[i]];
			if(a[i+1] - a[i] == 1){
				sum += c[a[i]];
			}
		}
	
		System.out.println(sum);
	}
}