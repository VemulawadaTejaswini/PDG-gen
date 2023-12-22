import java.util.Scanner;
 
public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		long multi = 1;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			multi = multi * a[i];
		}
		int num=0;
		int rest =0;
		while(rest == 0){
			rest = (int)multi%2;
			multi = multi/2;
			num += 1;
		}

		num -= 1;

		System.out.println(num);
	}
 
}