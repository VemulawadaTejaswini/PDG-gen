import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int k = 0, b, c = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		while(c == 0) {
			for(int i = 0; i < a.length; i++){
				if(a[i]%2 != 0){
					c = 1;
					break;
				}
			}
			k++;
		}
		System.out.println(a);
	}
}
