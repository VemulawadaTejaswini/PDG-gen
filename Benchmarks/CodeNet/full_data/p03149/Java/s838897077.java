import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> nums = Arrays.asList(sc.nextLine().split(" "));

        boolean one = nums.stream().anyMatch(x -> x.equals("1"));
        boolean nine = nums.stream().anyMatch(x -> x.equals("9"));
        boolean seven = nums.stream().anyMatch(x -> x.equals("7"));
        boolean four = nums.stream().anyMatch(x -> x.equals("4"));

        if (one && nine && seven && four) {
        	System.out.println("YES");
        } else {
         	System.out.println("NO");
        }
	}
}