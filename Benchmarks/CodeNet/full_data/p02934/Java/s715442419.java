import java.util.*;
public class Main {

	public static void main(String[] ble){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double inv = 0;
		for(int i = 0; i < n; i++){
			double a = sc.nextDouble();
			inv += 1/a;
		}
		System.out.println(1/inv);
	}
}
