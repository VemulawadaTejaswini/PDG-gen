import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number = sc.nextInt();
		int[] count = new int[1000000000];
		for(int i=0;i<number;i++) {
			int x = sc.nextInt();
			count[x-1]++;
			for(int j=2;j*j<=x;j++) {
				if(x%j==0) {
					count[j-1]++;
					count[x/j-1]++;
				}
			}
		}
		sc.close();
		
		int max = 1;
		for(int i=0;i<1000000000;i++) {
			if(count[i] >= number-1)
				max = i+1;
		}
		System.out.println(max);
	}
}