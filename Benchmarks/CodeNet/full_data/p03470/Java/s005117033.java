import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int mochi[] = new int[x];
		for(int i = 0;i < x;i++){
			mochi[i] = sc.nextInt();
		}
		Arrays.sort(mochi);
		int count = 1;
		for(int k = 0;k < x;k++){
			if(mochi[k] > mochi[k-1])count++;
		}
		System.out.println(count);
	}
}