import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		int answer = 0;

		while (x[0] != x[1] || x[1] != x[2]) {
			Arrays.sort(x);

			if (x[0] == x[1]) {
				x[2] += 2;
			} else {
				x[1] += 1;
				x[2] += 1;
			}
			answer++;
		}

		System.out.println(answer)
  }
}
