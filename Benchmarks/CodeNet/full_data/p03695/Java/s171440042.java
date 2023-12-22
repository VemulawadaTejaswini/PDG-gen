import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[8];
		int r = 0, c = 0;
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int index = a[i] / 400;
			if(index == 0) b[index]++;
			else if(index == 1) b[index]++;
			else if(index == 2) b[index]++;
			else if(index == 3) b[index]++;
			else if(index == 4) b[index]++;
			else if(index == 5) b[index]++;
			else if(index == 6) b[index]++;
			else if(index == 7) b[index]++;
			else c++;
		}
		for(int i = 0 ; i < 8 ; i++) {
			if(b[i] != 0) r++;
		}
		int min = Math.max(1, r);
		int max = 0;
		if(min == r) max = c + r;
		else max = c;
		System.out.println(min + " " + max);
	}
}
