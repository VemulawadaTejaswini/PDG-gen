import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String ...args) {
		try(Scanner scanner = new Scanner(System.in)){
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			ArrayList<Integer[]> firstArray = new ArrayList<>();
			ArrayList<Integer[]> secondArray = new ArrayList<>();
			boolean result = false;
			
			for(int i = 0; i <= M; i++) {
				Integer[] temp = new Integer[2];
				temp[0] = scanner.nextInt();
				temp[1] = scanner.nextInt();
				if(temp[0] == 1) firstArray.add(temp);
				if(temp[1] == N) secondArray.add(temp);
			}
			
			for(int i = 0; i < firstArray.size(); i++) {
				Integer[] temp = firstArray.get(i);
				
				for(int j = 0; j < secondArray.size(); j++) {
					Integer[] temp2 = secondArray.get(j);
					
					if(temp[1] == temp2[0]) {
						result = true;
						break;
					}
				}
				
				if(result) break;
			}
			
			if(result) {
				System.out.println("POSSIBLE");
			} else {
				System.out.println("IMPOSSIBLE");
			}
		}
	}
}
