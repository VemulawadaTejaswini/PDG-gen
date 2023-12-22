import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qty = sc.nextInt();
		int lighted = sc.nextInt();

		int height[] = new int[qty];
		for(int i = 0; i < qty; i ++) {
			height[i] = sc.nextInt();
		}
		for(int i = qty - 1; i > 0; i --) {
			for(int j = 0; j < i; j ++) {
				if(height[j] > height[j + 1]) {
					int tmp = height[j];
					height[j] = height[j + 1];
					height[j + 1] = tmp;
				}
			}
		}

		int differ[] = new int [qty - lighted + 1];
		int min = height[lighted - 1] - height[0];
		int minIndex = 0;
		for(int i = 0; i < qty - lighted + 1; i ++) {
			differ[i] = height[i + lighted - 1] - height[i];
			if(differ[i] < min) {
				min = differ[i];
				minIndex = i;
			}
		}

		System.out.println(differ[minIndex]);
	}
}