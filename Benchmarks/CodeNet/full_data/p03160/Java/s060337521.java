import java.util.*;
public class Main{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		// get a integer
		int a = sc.nextInt();
      	int[] input = new int[a];
      	for(int i=0; i<a ; i++){
        	input[i] = sc.nextInt();
        }
      	int[] arr = new int[input.length];
    	arr[0] = 0;
    	arr[1] = Math.abs(input[0] - input[1]);
    	for (int i = 2; i < arr.length; i++) {
      		arr[i] = Math.min(arr[i - 1] + Math.abs(input[i - 1] - input[i]),
          	arr[i - 2] + Math.abs(input[i - 2] - input[i]));
    	}
   		System.out.println(arr[arr.length - 1]);
    }
}