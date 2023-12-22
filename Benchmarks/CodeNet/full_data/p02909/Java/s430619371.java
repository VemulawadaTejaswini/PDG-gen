import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(new Main().weather_prediction(scanner.nextLine()));
		scanner.close();
	}
	
	public String weather_prediction(String weather) {
		String[] predictions = {"Sunny", "Cloudy", "Rainy"};
		int i;
		for(i = 0; i < 3; i++) {
			if(weather.equals(predictions[i])) {
				break;
			}
		}
		return predictions[(i + 1) % 3];
	}
}
