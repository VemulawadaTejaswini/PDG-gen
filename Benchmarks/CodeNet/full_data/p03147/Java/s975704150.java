import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] border = new int[101];
		int[] height = new int[101];
		int answer = 0;	//
		int count = 0;
		boolean flag = false;

		// input
		int num = scan.nextInt();
		for(int i = 0; i < num; i++){
			border[i] = scan.nextInt();
			if(border[i] == 0) {
				count++;
			}
		}
		border[num] = -1;

		while(true){
			flag = false;
			for(int i = 0; i <= num; i++){
				if(height[i] < border[i]){
					height[i] += 1;		// give water
					flag = true;
					if(height[i]== border[i]) {
						count++;
					}
				} else if(flag) {
					answer++;
					flag = false;
				}
			}
			if(count == num) {
				break;
			}
		}

		System.out.println(answer);


	}
}
