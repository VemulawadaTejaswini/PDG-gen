import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int workNum[] = new int[2];
		workNum[0] = sc.nextInt();
		workNum[1] = sc.nextInt();

		int diff = workNum[0] - workNum[1];
		diff = (diff < 0) ? diff * -1 : diff;
		if(diff % 2 == 1) {
			System.out.println("IMPOSSIBLE");
		}else {
			diff /= 2;
			System.out.println(workNum[0] > workNum[1] ?
					workNum[1] + diff : workNum[0] + diff);
		}
	}
}
