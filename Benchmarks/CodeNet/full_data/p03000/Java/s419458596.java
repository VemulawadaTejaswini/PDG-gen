import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		
		Integer[] array = new Integer[n];
		for(int i = 0; i < n; ++i) {
		    int tmp = sc.nextInt();
		    array[i] = tmp;
		}
		
		Integer[] array_pon = new Integer[n+1];
		array_pon[0] = 0;
		int sum = 0;
		for(int i = 1; i < n+1; ++i) {
		    sum += array[i-1];
		    array_pon[i] = sum;
		}
		
		int counter = 0;
		for(int i = 0; i < n+1; ++i) {
		    if(array_pon[i] <= x) ++counter;
		    else continue;
		}
		
		System.out.println(counter);	
	}
}