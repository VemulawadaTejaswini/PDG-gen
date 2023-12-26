public class Main {
	public static void main(String[] args) {
		int MAX = 1000;
		Scanner sc = new Scanner(System.in);
		String input = "";
		String[] data_nx = new String[2]; 
		int n = 0;
		int x = 0;
		int[] output = new int[MAX]; 
		int count_data = 0; 
		int[] number = new int[3];
		boolean judge = true; 
		out: for (int i = 0; i < MAX; i++) {
			input = sc.nextLine();
			data_nx = input.split(" ");
			n = Integer.parseInt(data_nx[0]);
			x = Integer.parseInt(data_nx[1]);
			if (n == 0 && x == 0) {
				break out;
			}
			if (n < 3 && n > 100) {
				judge = false;
				break out;
			}
			if (x < 0 && x > 300) {
				judge = false;
				break out;
			}
			count_data++;
			for (int j = 1; j <= (n - 2); j++) {
				number[0] = j;
				for (int k = j + 1; k <= n - 1; k++) {
					number[1] = k;
					for (int m = k + 1; m <= n; m++) {
						number[2] = m;
						if ((number[0] + number[1] + number[2]) == x) {
							output[i]++;
						}
					}
				}
			} 
		}
		if (judge == true) {
			for (int p = 0; p < count_data; p++) {
				System.out.println(output[p]);
			}
		}
	}
}
