import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int N=in.nextInt();
		int L=in.nextInt();
		String[] arr=new String[N];
		for (int i = 0; i < N; i++) {
			arr[i]=in.next();
		}
		Arrays.sort(arr);
		String a="";
		for (int i = 0; i < arr.length; i++) {
			a=a+arr[i];
		}
		System.out.println(a);
	}	
}