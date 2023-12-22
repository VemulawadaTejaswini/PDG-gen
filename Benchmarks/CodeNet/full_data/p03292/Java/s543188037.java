import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[3];
		for(int i=0;i<a.length;i++)a[i]=scan.nextInt();
		scan.close();
		Arrays.sort(a);
		System.out.println(a[1]-a[0]+a[2]-a[1]);
	}
}
