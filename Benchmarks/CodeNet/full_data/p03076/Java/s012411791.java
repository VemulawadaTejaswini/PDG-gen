import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dishes = new int[5];
		int[] dishes_v = new int[5];
		int sum = 0;
		int minrestidx = 0, minrest = 10;
		for(int i = 0;i < 5;i ++) {
			int v = sc.nextInt();
			dishes[i] = v;
			int rest = v % 10;
			if(rest < minrest && rest != 0) {
				minrest = rest;
				minrestidx = i;
			}
			if(rest != 0) v = v + (10 - rest);
			dishes_v[i] = v;
			sum += v;
		}
		sum = sum + dishes[minrestidx] - dishes_v[minrestidx];
		System.out.println(sum);
	}
}