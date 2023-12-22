import java.io.*;
import java.util.*;
public class Candies{
	public static int numOfOperations(int[] candies, int maxCount){
		int excessCandies;
		int opCost = 0;
		for (int i = 0; i < candies.length - 1; i ++){
			excessCandies = candies[i] + candies[i + 1] - maxCount;
			if (excessCandies <= 0)
				continue;
			else{
				opCost += excessCandies;
				if (excessCandies < candies[i + 1]){
					candies[i + 1] -= excessCandies;
				}
				else{
					candies[i] -= excessCandies - candies[i + 1];	
					candies[i + 1] = 0;
				}
			}
		}
		return opCost;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numOfBoxes = sc.nextInt();
		int maxCount = sc.nextInt();
		sc.nextLine();
		String[] arr = sc.nextLine().split(" ");
		int[] candies = new int[arr.length];
		for (int i = 0; i < arr.length; i ++){
			candies[i] = Integer.parseInt(arr[i]);
		}
		System.out.println(numOfOperations(candies, maxCount));
	}
}