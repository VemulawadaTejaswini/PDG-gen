import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++)arr[i] = sc.nextInt();
		int count = 0;
		for(int i = 0; i < 3; i++) {
			if(arr[i] == 1)count++;
		}
		System.out.println(count);
		sc.close();
	}
}