import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int n = Integer.parseInt(sc.next());

    	ArrayList<Integer> a1 = new ArrayList<>();
    	ArrayList<Integer> a2 = new ArrayList<>();

    	for (int i=0; i<n; i++){
    		a1.add(Integer.parseInt(sc.next()));
    	}

    	for (int i=0; i<n; i++){
    		a2.add(Integer.parseInt(sc.next()));
    	}

    	int max_sum = 0;

    	for (int i=0; i<n; i++){
    		int sum = 0;
    		for (int j = 0; j <= i; j++) {
				sum += a1.get(j);
			}
    		for (int j = i; j < n; j++) {
				sum += a2.get(j);
			}
    		if (max_sum < sum){
    			max_sum = sum;
    		}
    	}
    	System.out.println(max_sum);
    }
}