import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] temp = scanner.nextLine().split(" ");
		int[] list = new int[temp.length];
		for(int i  = 0; i < temp.length; i++) {
			list[i] = Integer.parseInt(temp[i]);
		}
		int times = 0;
		int flag = 0;
		while(flag == 0) {
			int guu = 0;
			for(int i = 0; i < list.length; i++) {
				if(list[i] % 2 == 0 && guu == 0) {
					list[i] /= 2;
					guu++;
				}else {
					list[i] *= 3;
				}
			}
			if(guu == 0) {
				break;
			}
			times ++;
		}
		System.out.println(times);



	}

}