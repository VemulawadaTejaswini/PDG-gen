import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		int maxsa = 0;
		//int maxa = 0;
		int sa = 0;
		int counter = 0;
		int maxa[] = new int[n];
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				if(maxa[i] < a[j]){
					maxa[i] = a[j];
				}
			}
		}
		for(int i=0; i<n-1; i++){
			sa = maxa[i] - a[i];
			if(maxsa < sa){
				maxsa = sa;
				counter = 1;
			}
			else if(maxsa == sa){
				counter = counter + 1;
			}
			//maxa = 0;
		}
		System.out.println(counter);
}
}
