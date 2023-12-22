import java.util.*;

public class Main {
	private static int n;
	private static int[] a;

	private static int[] quickSort(int[] array) {
		if(array.length == 1)
			return array;
		int pivot = array[0];
		for(int i = 1; i < array.length && array[i - 1] == array[0]; i++) {
			if(array[i] != array[0])
				pivot = (array[i] > array[0]) ? array[i] : array[0];
			else {
				if(i == array.length - 1)
					return array;
			}
		}
		int count = 0;
		int[] small = new int[array.length];
		int[] large = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < pivot) {
				small[count] = array[i];
				count++;
			} else
				large[i - count] = array[i];
		}
		int[] small_resize = new int[count];
		for(int i = 0; i < count; i++)
			small_resize[i] = small[i];
		int[] large_resize = new int[array.length - count];
		for(int i = 0; i < array.length - count; i++)
			large_resize[i] = large[i];
		small_resize = quickSort(small_resize);
		large_resize = quickSort(large_resize);
		int[] result = new int[array.length];
		for(int i = 0; i < count; i++)
			result[i] = small_resize[i];
		for(int i = count; i < array.length; i++)
			result[i] = large_resize[i - count];
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		a = quickSort(a);
		int identity = 1;
		int flag = a[0];
		for(int i = 1; i < n; i++) {
			if(a[i] != flag) {
				identity++;
				flag = a[i];
			}
		}
		System.out.println(String.valueOf(identity - ((identity + 1)%2)));
	}
}