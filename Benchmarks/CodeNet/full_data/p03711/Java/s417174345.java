import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> groupA = Arrays.asList(new Integer[]{1,3,5,7,8,10,12});
		List<Integer> groupB = Arrays.asList(new Integer[]{4,6,9,11});
		List<Integer> groupC = Arrays.asList(new Integer[]{2});

		Scanner sc = new Scanner(System.in);
		final int firstNum = sc.nextInt();
		final int secondNum = sc.nextInt();

		if( 
			isContainGroup(groupA, firstNum, secondNum)
			|| isContainGroup(groupB, firstNum, secondNum)
			|| isContainGroup(groupC, firstNum, secondNum)
		){
			System.out.print("Yes");
		} else {
			System.out.print("no");
		}
	}
	
	private static boolean isContainGroup(List group, int num1, int num2 ){
		return group.contains(num1) && group.contains(num2) ;
	}

}
