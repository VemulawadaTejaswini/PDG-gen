import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dishAmount = 5;
		int[] time = new int[dishAmount];
		int lastTime = 0;
		int totalTime = 0;
		for(int i = 0 ; i < dishAmount ; i++) {
			time[i] = sc.nextInt();
			if(time[i] % 10 != 0) {
				totalTime = totalTime + (10 * ((time[i] / 10) + 1));
				
				if(lastTime < 10 - (time[i] % 10)) {
					lastTime = 10 - (time[i] % 10);
				}
			}else {
				totalTime = totalTime + time[i];
			}
		}
		sc.close();
		System.out.println(totalTime - lastTime);
	}
}