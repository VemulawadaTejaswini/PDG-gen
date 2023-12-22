import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[1000001];
		for(int i=0;i<n;i++){
			int ai = sc.nextInt();
			int bi = sc.nextInt();
			a[ai] += bi;
		}
		int counter = 0;
		int ans = 0;
		while(k>0&&counter<a.length){
			if(a[counter] == 0){
				counter ++;
			} else {
				if(k<=a[counter]){
					ans = counter;
					break;
				} else {
					k -= a[counter];
					counter ++;
				}
			}
		}
		System.out.println(ans);

	}

}