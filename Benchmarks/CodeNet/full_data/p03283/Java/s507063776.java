import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();

		int[] l = new int[M];
		int[] r = new int[M];
		for(int i = 0; i < M; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		quickSort(l, r, 0, M - 1);

		int[] p = new int[Q];
		int[] q = new int[Q];
		for(int i = 0; i < Q; i++) {
			p[i] = sc.nextInt();
			q[i] = sc.nextInt();
		}

		for(int i = 0; i < Q; i++) {
			int ans = 0;
			for(int j = 0; j < M; j++) {
				if(p[i] > l[j]) break;
				if(q[i] < r[j]) continue;
				ans++;
			}
			System.out.println(ans);
		}
	}

	static void quickSort(int[] array, int[] array2, int left, int right){
		int index = partition(array, array2, left, right);
		if(left < index - 1){
			quickSort(array, array2, left, index - 1);
		}
		if(index < right){
			quickSort(array, array2, index, right);
		}
	}

	static int partition(int[] array, int[] array2, int left, int right){
		int pivot = array[(left + right)/2];
		while (left < right) {
			while (array[left] > pivot) left++;
			while(array[right] < pivot) right --;
			if(left <= right){
				int tmp = array[left];
				array[left] = array[right];
				array[right] = tmp;
				tmp = array2[left];
				array2[left] = array2[right];
				array2[right] = tmp;
				left ++;
				right --;
			}
		}
		return left;
	}
}