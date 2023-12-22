import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			int max = 0;
			for(int j=0;j<n;j++){
				if(i != j){
					if(max<a[j]){
						max = a[j];
					}
				}
			}
			System.out.println(max);
		}
		sc.close();

	}
}
