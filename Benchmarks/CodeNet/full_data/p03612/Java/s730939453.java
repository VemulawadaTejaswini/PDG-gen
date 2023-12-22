import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scanner.nextInt();
		}
		int count = 0;
		for(int i=0;i<n-1;i++){
			if(a[i] == i+1){
				int tmp = a[i];
				a[i] = a[i+1];
				a[i+1] = tmp;
				count++;
			}
		}
		System.out.println(count);
	}

}
