import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[3];
		for(int i=0;i<a.length;i++)a[i]=scan.nextInt();
		scan.close();
		Arrays.sort(a);
		if(Math.abs(a[0]-a[1]) > Math.abs(a[2]-a[1]))System.out.println(Math.abs(a[2]-a[1]));
		else System.out.println(Math.abs(a[0]-a[1]));
	}
}