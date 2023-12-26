public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputN = Integer.valueOf(scanner.next());
		int[] height = new int[inputN+1];
		for(int i = 1; i <= inputN; i++) {
			height[i] = Integer.valueOf(scanner.next());
		}
		scanner.close();
		int result = 1;
		boolean flag = true;
		for(int i = 2; i <= inputN; i++) {
			for(int j = 1; j <= i - 1; j++) {
				if(height[j] > height[i]) {
					flag = false;
				}
			}
			if(flag == true) {
				result++;
			} else {
				flag = true;
			}
		}
		System.out.println(result);
	}
}
