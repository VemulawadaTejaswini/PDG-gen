import java.util.*;

public class Main {
	int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
        int count = 0;

		for (int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		if(sort(a) < 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}
	
	 public static int sort(int[] array){
	        int temp;
	        int count = 0;
	        for(int i = 0; i < array.length; i++){
	            for(int j = 0; j< array.length -i -1; j ++){
	                if(array[j] > array[j + 1]){
	                    temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
}