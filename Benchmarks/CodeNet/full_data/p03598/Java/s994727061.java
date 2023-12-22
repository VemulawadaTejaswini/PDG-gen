
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
        
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
			int min = Math.min(k - list[i], list[i]);
			sum += min * 2;
		}
        
        System.out.println(sum);
    }
}