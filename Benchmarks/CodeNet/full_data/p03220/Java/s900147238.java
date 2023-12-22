import java.util.*;
import java.lang.Math.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temperature = sc.nextInt();
        int average = sc.nextInt();
        int result = 1;
        int resultAbs = (int)Math.abs(average - sc.nextInt() * 0.006);
        for (int i = 1; i < n; i++) {
            int abs = (int)Math.abs(average - sc.nextInt() * 0.006);
            if (resultAbs >= abs) {
                resultAbs = abs;
                result = i+1;
            }
        }
        System.out.println(result);
    }
}