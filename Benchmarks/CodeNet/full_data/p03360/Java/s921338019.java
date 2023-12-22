import java.util.ArrayList;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i =0;i<4;i++){
			numbers.add(sc.nextInt());
		}
		for(int i =0;i<3;i++){
			max = Math.max(max, numbers.get(i));
		}
		numbers.set(numbers.indexOf(max), max*(int)Math.pow(2, numbers.get(3)));
		int sum = 0;
		for(int i =0;i<3;i++){
			sum += numbers.get(i);
		}
		System.out.println(sum);
	}

}
