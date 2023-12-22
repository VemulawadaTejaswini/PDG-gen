import java.util.*;
 
public class Main{
  
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		int[] array = new int[n+1];
		for(int i = 1; i <= n; i++) {
			if(i >= 1000) {
				array[i] = 1;
			}else if(i >= 100) {
				array[i] = i/100 + (i%100)/10 + i%10;
			}else {
				array[i] = i/10 + i%10;
			}
			//System.out.println(array[i]);
			if(a <= array[i] && array[i] <= b) {
				result += i;
			}
		}
		System.out.println(result);
	}
}