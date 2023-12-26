public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		String[] input_data = new String[3]; 
		int MAX_DATA = 50;
		int data_count = 0;
		int m = 0; 
		int f = 0; 
		int r = 0; 
		int sum = 0; 
		boolean judge = true; 
		String[] output = new String[MAX_DATA];
		out: for (int i = 0; i < MAX_DATA; i++) {
			input = sc.nextLine();
			input_data = input.split(" ");
			sum = 0;
			m = Integer.parseInt(input_data[0]);
			f = Integer.parseInt(input_data[1]);
			r = Integer.parseInt(input_data[2]);
			if (m == -1 && f == -1 && r == -1) {
				break out;
			}
			if (m < -1 && m > 50) {
				judge = false;
				break out;
			}
			if (f < -1 && f > 50) {
				judge = false;
				break out;
			}
			if (r < -1 && r > 100) {
				judge = false;
				break out;
			}
			data_count++; 
			sum = m + f;
			if (m == -1 || f == -1) {
				output[i] = "F";
			} else if (sum >= 80) {
				output[i] = "A";
			} else if ((sum >= 65 && sum < 80)) {
				output[i] = "B";
			} else if (sum >= 50 && sum < 65) {
				output[i] = "C";
			} else if (sum >= 30 && sum < 50) {
				output[i] = "D";
				if (r >= 50) {
					output[i] = "C";
				}
			} else {
				output[i] = "F";
			}
		} 
		if (judge == true) {
			for (int j = 0; j < data_count; j++) {
				System.out.println(output[j]);
			}
		}
	}
}
