import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		long array[] = new long[n];
		for(int i = 0; i < n; i++) {
			array [i] = i;
			if(i%3!=0 && i%5!=0) 
				sum+=array[i];
			else 
				array[i]=0;
		}
		System.out.println(sum);
	}

}
