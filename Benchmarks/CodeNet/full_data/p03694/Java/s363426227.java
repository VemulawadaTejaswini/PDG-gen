import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int[] array = new int[n];
	    for(int i=0; i<n; i++) {
	        array[i] = scanner.nextInt();
        }

	    int max = 0;
	    int min = 0;
	    for(int j=0; j<array.length; j++) {
	        if(array[0] < array[j]) {
	            max = array[j];
	            array[0] = max;
            }
	        if(array[0] > array[j]) {
	            min = array[j];
	            array[0] = min;
            }
        }
	    System.out.println(max-min);
    }
}