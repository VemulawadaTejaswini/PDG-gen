import java.util.Scanner;

public class Main {
	public static void main (String[] arg) {
		Scanner scan = new Scanner(System.in);
		int ope_cnt = 0;
		boolean break_flag = false;
		
		int num_number = Integer.parseInt(scan.nextLine());
		String[] input = scan.nextLine().split(" ");
		int[] input_int = new int[num_number];
		
		for(int i = 0; i < num_number; i++) {
			input_int[i] = Integer.parseInt(input[i]);
		}
		
		int[] output_int = input_int; 
		while (true) {
			for (int i = 0; i < num_number; i++ ) {
				if (output_int[i] % 2 == 0) {
					output_int[i] /= 2; 
				} else {
					break_flag = true;
					break;
				}
			}
			if (break_flag == true) {break;}
			ope_cnt += 1;
		}
		
		System.out.println(ope_cnt);
		scan.close();
	}
}
