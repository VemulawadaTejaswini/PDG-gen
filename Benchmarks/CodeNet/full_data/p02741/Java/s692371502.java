import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int[] suretu = new int[32];
	suretu[0] = 1;
	suretu[1] = 1;
	suretu[2] = 1;
	suretu[3] = 2;
	suretu[4] = 1;
	suretu[5] = 2;
	suretu[6] = 1;
	suretu[7] = 5;
	suretu[8] = 2;
	suretu[9] = 2;
	suretu[10] = 1;
	suretu[11] = 5;
	suretu[12] = 1;
	suretu[13] = 2;
	suretu[14] = 1;
	suretu[15] = 14;
	suretu[16] = 1;
	suretu[17] = 5;
	suretu[18] = 1;
	suretu[19] = 5;
	suretu[20] = 2;
	suretu[21] = 2;
	suretu[22] = 1;
	suretu[23] = 15;
	suretu[24] = 2;
	suretu[25] = 2;
	suretu[26] = 5;
	suretu[27] = 4;
	suretu[28] = 1;
	suretu[29] = 4;
	suretu[30] = 1;
	suretu[31] = 51;
	int k = sca.nextInt();

	System.out.println(suretu[k-1]);

	// 後始末
	sca.close();
	}
}


