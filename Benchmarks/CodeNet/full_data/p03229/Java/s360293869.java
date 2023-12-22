import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        	arr[i] = sc.nextInt();
        Arrays.sort(arr);
        
       	int head = arr[n-1], tail = head;
       	int left = 0, right = n - 2;
       	long sum = 0L;
        while(left < right) {
        	if(Math.abs(arr[left] - head) > Math.abs(arr[left] - tail)) {
        		sum += Math.abs(arr[left] - head);
        		head = arr[left];
        	} else {
        		sum += Math.abs(arr[left] - tail);
        		tail = arr[left];
        	}
        	left++;

        	if(Math.abs(arr[right] - head) > Math.abs(arr[right] - tail)) {
        		sum += Math.abs(arr[right] - head);
        		head = arr[right];
        	} else {
        		sum += Math.abs(arr[right] - tail);
        		tail = arr[right];
        	}
        	right--;

        }
        if(left == right)
            sum += Math.max(Math.abs(arr[right] - head), Math.abs(arr[right] - tail));
        System.out.println(sum);
    }
}
