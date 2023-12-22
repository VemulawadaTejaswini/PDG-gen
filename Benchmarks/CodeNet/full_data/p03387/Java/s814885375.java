import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num =new int[3];
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		Arrays.sort(num);
		int count = 0;
		if((3*num[2])%2!=(num[0]+num[1]+num[2])%2) {
			num[2]++;
			count++;
		}
		count += ((3*num[2])-(num[0]+num[1]+num[2]))/2;
		System.out.println(count);
	}
}