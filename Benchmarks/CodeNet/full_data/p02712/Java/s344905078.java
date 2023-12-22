import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		long array[] = new long[n];
		for(int i = 0; i < n; i++) {
			array [i] = i;
			if(i%3==0 || i%5==0) 
				array[i]=0;
			else 
				sum+=array[i];
		}
		System.out.println(sum);
	}

}
