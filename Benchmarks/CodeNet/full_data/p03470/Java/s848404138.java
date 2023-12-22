import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[] d = new Integer[n];
		for(int i=0;i<n;i++){
			d[i] = scanner.nextInt();
		}
		Arrays.sort(d,Comparator.reverseOrder());
		int beforeSize = d[0];
		int count = 1;
		for(int i=1;i<n;i++){
			if(d[i] < beforeSize){
				count++;
			}
			beforeSize = d[i];
		}
		System.out.println(count);
	}

}
