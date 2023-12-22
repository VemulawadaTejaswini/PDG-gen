import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] nums = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			nums[a[i]]++;
		}
		
		for (int k = 0; k < n; k++) {
			// debug
			// System.out.println("k:" + k);
			
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				// debug
				// System.out.println(" i:" + i);
				
				int num = nums[i];
				if (a[k] == i)
					num = Math.max(0, num - 1);
				
				// debug
				// int tmp =  num * (num - 1) / 2;
				// System.out.println(" tmp:" + tmp);
				
				sum += num * (num - 1) / 2;
			}
			System.out.println(sum);
		}
		
		sc.close();
	}
}
