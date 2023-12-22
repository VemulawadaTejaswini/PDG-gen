import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		if (arr.length == 2 && arr[0] == arr[1]) {
		    System.out.println("1 2");
		    return;
		}
		for (int i = 0; i < arr.length - 2; i++) {
		    if (arr[i] == arr[i + 1] || arr[i] == arr[i + 2] || arr[i + 1] == arr[i + 2]) {
		        System.out.println((i + 1) + " " + (i + 2));
		        return;
		    }
		}
		System.out.println("-1 -1");
   }
}


