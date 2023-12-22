package AGC013;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input_count = sc.nextInt();

		int[] array = new int[input_count];

		int array_count = 0;
		int pre_num = 0;

		for(int i = 0;i < array.length;i++){
			int num = sc.nextInt();

			if(pre_num == num){
				continue;
			}

			pre_num = num;
			array[array_count] = num;
			array_count++;
		}


		int i_is_up = 0;

		int line_count = 1;

		for(int i = 0;i < array.length - 1;i++){
			int sign = Integer.signum(array[i + 1] - array[i]);

			if(i_is_up == 0){
				i_is_up = sign;
				continue;
			}

			if(i_is_up != sign){
				line_count++;
				i_is_up = 0;
			}
		}

		System.out.println(line_count);

		sc.close();
	}

}
