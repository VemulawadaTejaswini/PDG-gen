import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		List<Integer> nums = new ArrayList<>();
		for(int i=0; i<n; i++) {
			nums.add(sc.nextInt());
		}
		
		OptionalInt min = nums.stream().mapToInt(num -> num.intValue()).min();
		OptionalInt max = nums.stream().mapToInt(num -> num.intValue()).max();
		
		System.out.println(Math.abs(max.getAsInt() - min.getAsInt()));
		
		sc.close();
	}
}
