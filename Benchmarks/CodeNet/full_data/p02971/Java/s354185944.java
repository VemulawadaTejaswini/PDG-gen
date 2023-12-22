import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int max1 = -1, max2 = -1;
		int index1 = -1, index2 = -1;
		for(int i = 0;i < N;i++) {
			int Ai = scn.nextInt();
			if(max1 <= Ai) {
				max2 = max1;
				max1 = Ai;
				index2 = index1;
				index1 = i;
			}else {
				if(max2 <= Ai) {
					max2 = Ai;
					index2 = i;
				}
			}
		}
		for(int i = 0;i < N;i++) {
			System.out.println((i==index1)?max2:max1);
		}
	}

}