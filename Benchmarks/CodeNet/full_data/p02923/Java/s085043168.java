import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		int maxCount  = 0;
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = i; j < n; j++) {
				if(j+1 > n-1)
					break;
				if(h[j+1] <= h[j])
					count++;
				else
					break;
			}
			if(count > maxCount)
				maxCount = count;
		}
        System.out.println(maxCount);

	}


}
