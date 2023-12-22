import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long input[] = new long[6];
		long areaNumber[] = new long[5];

		for(int i = 0; i < 6; i++) {
			 input[i] = Integer.parseInt(sc.nextLine());
		}

		long time = 0;

		long sumGoalMember = 0;

		areaNumber[0] = input[0];

		while(input[0] != sumGoalMember) {

			if(input[0] != 0) {
				areaNumber[0] = areaNumber[0] - input[1];
				areaNumber[1] = areaNumber[1] + input[1];
			}else if(input[1] != 0) {
				areaNumber[1] = areaNumber[1] - input[2];
				areaNumber[2] = areaNumber[2] + input[2];

			}else if(input[2] != 0) {
				areaNumber[2] = areaNumber[2] - input[3];
				areaNumber[3] = areaNumber[3] + input[3];

			}else if(input[3] != 0) {
				areaNumber[3] = areaNumber[3] - input[4];
				areaNumber[4] = areaNumber[4] + input[4];

			}else if(input[4] != 0) {
				areaNumber[4] = areaNumber[4] - input[5];
				areaNumber[5] = areaNumber[5] + input[5];

			}else if(input[5] != 0) {
				areaNumber[5] = areaNumber[5] - input[6];
				sumGoalMember = sumGoalMember + input[6];

			}

			time++;
		}

		System.out.println(time);
	}

}