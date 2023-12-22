import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0, pmax = 0;
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
		}
		for (int i = 0; i < n; i++) {
			if (max != a[i])pmax = Math.max(pmax, a[i]);
		}
		int i;
		for (i = 0; i < n; i++) {
			if(pmax==0){
				System.out.println(max);
			}else if (max > pmax) {
				if (max == a[i])System.out.println(pmax);
				else System.out.println(max);
			}  
		}
	}
}
