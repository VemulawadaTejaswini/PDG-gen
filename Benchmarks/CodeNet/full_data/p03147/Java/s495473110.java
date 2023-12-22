import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int totalFlower = scanner.nextInt();
		int flowersHeight[] = new int[totalFlower];

		for(int i = 0; i < totalFlower; ++i) {
			flowersHeight[i] = scanner.nextInt();
		}

		int wateringTimes = 0;

		loop:while(true) {

			boolean  start = false;

			for(int i = 0, j = 0; i < totalFlower; ++i) {

				if(!start && (flowersHeight[i] != 0)) {
					--flowersHeight[i];
					start = true;
				}
				else if(start && (flowersHeight[i] != 0)) {
					--flowersHeight[i];
				}
				else if(start && (flowersHeight[i] == 0)) {
					break;
				}
				else {
					if(++j == totalFlower) break loop;
				}

			}
			++wateringTimes;
		}

		System.out.print(wateringTimes);

		scanner.close();
	}

}
