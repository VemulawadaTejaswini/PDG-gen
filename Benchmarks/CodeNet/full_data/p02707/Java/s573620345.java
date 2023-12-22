import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n-1; i++){
			a[i+1] = sc.nextInt();
		}
		for(int i = 1; i < n; i++){
			int ct = 0;
			for(int j = 1; j < n; j++){
				if(i == a[j]){
					ct++;
				}
				
			}
			System.out.println(ct);
		}
      System.out.println(0);
		
	}
}
