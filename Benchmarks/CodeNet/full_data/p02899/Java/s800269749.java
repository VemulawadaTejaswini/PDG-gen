import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		int a[][] = new int[2][n];
		
		for (int i = 0; i < n; i++) {
			a[0][i] = sc.nextInt();
			a[1][i] = i + 1;
		}
		
		quickSort(a, 0, n - 1);
		
		for (int i = 0; i < n; i++) {
			System.out.print( a[1][i] + " " );
		}
		
		return;
	}
	
	public static void quickSort(int array[][], int left, int right) {
	
		
		if ( left > right ) {
			return;
		}
		
		
		int pivotValue = array[0][(left + right) / 2];
		
		int i = left;
		int j = right;
		
		while ( i <= j ) {
			while (array[0][i] < pivotValue) {
				i++;
			}
			
			while (array[0][j] > pivotValue) {
				j--;
			}
			
			if ( i <= j ) {
				quickSortSwap(array, i, j);
				
				i++;
				j--;
			}
		}
		
		quickSort(array, left, j);
		quickSort(array, i, right);
	}
		
		
	public static void quickSortSwap(int array[][], int i, int j) {
		int temp0 = array[0][i];
		int temp1 = array[1][i];
		
		array[0][i] = array[0][j];
		array[1][i] = array[1][j];
		
		array[0][j] = temp0;
		array[1][j] = temp1;
		
		return;
	}

}
