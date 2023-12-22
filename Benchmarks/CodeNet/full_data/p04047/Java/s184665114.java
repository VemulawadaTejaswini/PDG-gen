import java.util.*;
public class Main {

public void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int maxCnt = sc.nextInt();
	int[] arr = new int[maxCnt*1];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}

	sort(arr, 0, arr.length);

	int sum = 0;
	for(int i = 0; i < maxCnt * 2; i+=2) {
		sum += arr[i+1];
	} 

	System.out.println(sum);
}

private void sort(int[] arr, int start, int end) {
	if(start >= end) {
		return;
	}

	int originStart = start;
	int originEnd = end;

	int target = arr[start];

	while(start < end) {
		while(start < end && target > arr[end]) {
			end--;
		}
		if(start < end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
		}

		while(start < end && arr[start] >= target) {
			start++;
		}
		if(start < end) {
			temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
		}
	}

	sort(arr, originStart, start - 1);
	sort(arr, end + 1, originEnd);
}

}
