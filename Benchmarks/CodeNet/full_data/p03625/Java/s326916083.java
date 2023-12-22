import java.util.*;
public class Main {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        long array[] = new long[n];
	        long arr[] = new long[2];
	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	        }
	        Arrays.sort(array);
	        int count = 0;
	        for (int i = n - 1; i >= 1; i--) {
	            if (array[i] == array[i - 1]) {
	                arr[count] = array[i];
	                count++;
	                i--;
	            }
	            if (count == 2) {
	                break;
	            }
	        }
	        System.out.println(arr[0] * arr[1]);

	    }
}
