import java.util.*;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
        int[] numbers = new int[l];
        for (int a = 0; a < l; a++) {
            numbers[a] = sc.nextInt();
        }
 for (int i = 0; i < l; i++) {
            int[] remaining = new int[l];
            for (int j = 0; j < l; j++) {
                if (j != i) {
                    remaining[j] = numbers[j];
                }
            }
            Arrays.sort(remaining);
            System.out.println((remaining[l/2]));
        }
	}
}