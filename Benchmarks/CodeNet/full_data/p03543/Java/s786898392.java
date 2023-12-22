import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long[] arrays = new long[(int) (num+1)];
		arrays[0] = 2;
		arrays[1] = 1;
		for (int i = 2; i < arrays.length; i++) {
			arrays[i] = arrays[i-1] + arrays[i-2];
		}
		System.out.println(arrays[(int) num]);
	}

}