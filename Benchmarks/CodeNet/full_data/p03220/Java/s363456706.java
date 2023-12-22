import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		List<Integer> heights = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			heights.add(sc.nextInt());
		}
		
		List<Double> avt = heights.stream().map(heigh -> Math.abs((t-heigh.intValue()*0.006) - a)).collect(Collectors.toList());
		
		OptionalInt min = avt.stream().mapToInt(num -> num.intValue()).min();
		
		for(int i=0; i<n; i++) {
			if(avt.get(i).equals( min.getAsInt())) {
				System.out.println(i+1);
			}
		}
		
		sc.close();
	}
}
