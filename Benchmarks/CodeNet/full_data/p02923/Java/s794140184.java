import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int count = 0;
        int tmp = 0;
        for (int i = 0; i < N; i++) {
        	int Hi = sc.nextInt();
        	if (Hi <= tmp) {
        		count++;
        	} else {
        		if (max < count) {
        			max = count;
        		}
        		count = 0;
        	}
        	tmp = Hi;
        }
		if (max < count) {
			max = count;
		}
        System.out.println(max);
    }
}