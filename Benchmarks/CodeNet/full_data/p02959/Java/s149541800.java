import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int[] listA = new int[n+1];
	int[] listB = new int[n];
	for(int i =0; i<n+1; i++) {
			listA[i] = Integer.parseInt(sc.next());
	}
	for(int i =0; i<n; i++) {
			listB[i] = Integer.parseInt(sc.next());
	}

	int sum =0;
	int power = 0;
	int least = listA[n];
	for(int i=n; i>=1; i--) {
		if(least<listB[i-1]) {
			sum = sum + least;
			power = listB[i-1] - least;
		}else {
			sum = sum + listB[i-1];
			power = 0;
		}

		least = listA[i-1] - power;
		if(least<0) {
			least = 0;
			sum = sum + listA[i-1];
		}else {
			sum = sum + power;
		}

	}
	System.out.println(sum);
	}
}
