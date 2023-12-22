import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		try (Scanner sc = new Scanner(System.in)) {
			int left = sc.nextInt();
			int center = sc.nextInt();
			int right = sc.nextInt();
 
			Integer array[] = {left, center, right};
 
			Arrays.sort(array, Comparator.reverseOrder());
 
			int outLeft = array[0];
			int outCenter = array[1];
			int outright = array[2];
 
			String leftAndCenterStr = String.valueOf(outLeft) + String.valueOf(outCenter);
			Integer leftAndCenterNum = Integer.valueOf(leftAndCenterStr);
			int sum = leftAndCenterNum + outright;
 
			System.out.println(sum);
 
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}