import java.util.*;

public class Main {
	
	int numArrays;
	int upperLimit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numArrays = sc.nextInt();
		int upperLimit = sc.nextInt();
		int[][] arr = new int[numArrays][upperLimit];

		for (int i = 0; i < numArrays; i++) {
			for (int j = 0; j < upperLimit; j++) {
				arr[i][j] = j+1;	
			}
		}

		int numOps = sc.nextInt();
		int[] ops = new int[numOps];
		for (int i = 0; i < numOps; i++) {
			ops[i] = sc.nextInt();
		}

		if (possible(arr, numArrays, upperLimit, ops)) 
			System.out.println("Yes");
		else
			System.out.println("No");

		// moveFront(ops, arr);
		// print(arr, numArrays, upperLimit); // for checking
	}

	public static boolean possible(int[][] arr, int numArrays, int upperLimit, int[] ops) {
		
		
		return true;
	}

	public static void moveFront(int[] ops, int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == ops[i]) {
					int[][] newArr = clone(arr);
					newArr[i][j] = ops[i];
				}
			}
		}	
	}
		
	public static int[][] clone(int[][] arr) {
		int[][] newArr = new int[arr.length][arr[0].length];
		// clone the arr
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				newArr[i][j+1] = arr[i][j];		
			}
		}

		return newArr;
	}
		

	public static void print(int[][] arr, int numArrays, int upperLimit) {
		for (int i = 0; i < numArrays; i++) {
			System.out.print("(");
			for (int j = 0; j < upperLimit; j++) {
				System.out.print(arr[i][j]);
				if (j != upperLimit-1) 
					System.out.print(",");
			}
			System.out.println(")");
		} 
	}

}
