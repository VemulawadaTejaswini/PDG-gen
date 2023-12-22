import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] x = new int[m];
		for (int i = 0; i < m; i++)
			x[i] = in.nextInt();

		if (n >= m)
			System.out.println(0);
		else {
			quickSort(x);
			int[] d = new int[m - 1];
			
			for (int i = 0; i < m - 1; i++)
				d[i] = x[i + 1] - x[i];
			
			quickSort(d);
			int ans = 0;
			
			for (int i = 0; i < m - n; i++)
				ans += d[i];
			
			System.out.println(ans);
		}
		
	}
	
	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
	}
	
	public static void quickSort(int[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}
	
	public static int partition(int[] list, int first, int last) {
		int pivot = list[first];
		int low = first + 1;
		int high = last;
		
		while (high > low) {
			while (low <= high && list[low] <= pivot)
				low++;
			
			while (low <= high && list[high] > pivot)
				high--;
			
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		
		while (high > first && list[high] >= pivot)
			high--;
		
		if (pivot >list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else
			return first;
	}

}