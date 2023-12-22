import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		Map<Integer, Integer> sequence = new HashMap<>();
		int i = 1;
		int tmp = s;
		while(true) {
			sequence.put(i, tmp);
			if(tmp%2 == 0) {
				tmp = tmp/2;
			} else {
				tmp = 3*tmp+1;;
			}
			if(sequence.containsValue(tmp)) {
				System.out.println(i+1);
				break;
			}
			i++;
		}
	}
}