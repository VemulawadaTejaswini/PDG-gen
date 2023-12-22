import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		ArrayList<Integer> inputs = new ArrayList<Integer>();
		for(int n =0; n<a; n++) {
			int ele = scanner.nextInt();
			inputs.add(ele);
		}
		
		List<Integer> answers = new ArrayList<Integer>();
		for(int xi =1; xi<=100 ; xi++) {
			answers.add(min(xi,inputs));
		}
		
		List<Integer> sorted = answers.stream().sorted((o1,o2)->o1.intValue()-o2.intValue()).collect(Collectors.toList());
		System.out.println(sorted.get(0));
	}
	
	public static int min(int in,ArrayList<Integer> inputs) {
		int ans = 0;
		for(Integer ins: inputs) {
			ans += (ins-in)*(ins-in);
		}
		return ans;
	}
	
}