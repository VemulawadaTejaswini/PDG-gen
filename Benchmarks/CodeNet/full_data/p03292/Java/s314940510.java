import java.util.*;
public class Main {
	public static void main(String[] args){
		taskScheduling();
	}
	
	public static void taskScheduling() {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		a[0] =  sc.nextInt();
		a[1] =  sc.nextInt();
		a[2] =  sc.nextInt();
		Arrays.sort(a);
		int res = 0;
		for (int i=1; i<a.length; i++) {
			res += a[i]-a[i-1];
		}
		System.out.println(res);
	}
}