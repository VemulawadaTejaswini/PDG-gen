import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int k;
		List<Integer> spot = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			spot.add(scanner.nextInt());
		}
		k = scanner.nextInt();
		List<Integer> tmpSpot = new ArrayList<>(spot);
		
		for(int i = 0; i < 5; i++) {
			tmpSpot.remove(i);
			for (int l : tmpSpot) {
				if ((l - spot.get(i)) > k) {
					System.out.println(":(");
					return;
				}
			}
		}
		scanner.close();
		System.out.println("Yay!");
	}