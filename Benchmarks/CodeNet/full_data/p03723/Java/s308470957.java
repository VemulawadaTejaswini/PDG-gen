import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		boolean rtnFlag = false;
		int count = 0;
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		
//		int arrayLength = 0;
		ArrayList<int[]> list = new ArrayList<int[]>();
//		int[][] intArray = new int[arrayLength][3];
//		int[] tempArray = {n1, n2, n3};
//		Arrays.sort(tempArray);
//		list.add(tempArray);
//		intArray[0][0] = n1;
//		intArray[0][1] = n2;
//		intArray[0][2] = n3;
//		arrayLength++;
//		Arrays.sort(intArray[0]);
		while (!rtnFlag) {
			if (n1 % 2 != 0 || n2 % 2 != 0 || n3 % 2 != 0 ) {
				rtnFlag = true;
			} else {
				int[] tempArray = new int[3];
				tempArray[0] = n1;
				tempArray[1] = n2;
				tempArray[2] = n3;
				Arrays.sort(tempArray);
//					if (Arrays.binarySearch(intArray, tempArray) >= 0) {
//						count = -1;
//						rtnFlag = true;
//					} else {
//						intArray[arrayLength++] = tempArray;
//					}
				
				if (isExisted(list, tempArray)) {
					count = -1;
					rtnFlag = true;
					break;
				} else {
					list.add(tempArray);
				}
				temp1 = n1 / 2;
				temp2 = n2 / 2;
				temp3 = n3 / 2;
				n2 = n2 / 2 + temp1;
				n3 = n3 / 2 + temp2;
				n1 = n1 / 2 + temp3;
				count++;
			}
		}
		System.out.println(count);
	}
	
	private static boolean isExisted(ArrayList<int[]> list, int[] intArray) {
		boolean rtnFlag = false;
		for (int[] temp : list) {
			if (Arrays.equals(temp, intArray)) {
				rtnFlag = true;
				break;
			}
		}
		return rtnFlag;
	}
}