import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[3];
		for (int i=0;i<3;i++) {
			number[i]=Integer.parseInt(sc.next());
		}
		Arrays.sort(number);
		System.out.println(number[0]*number[1]/2);
	}
}