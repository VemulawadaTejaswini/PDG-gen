import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//ArrayList<Integer> JPY = new ArrayList<Integer>();
		ArrayList<Double> BTC = new ArrayList<Double>();
		Double x;
		String u;
		Double sum = 0.0;
		for(int i = 0;i < n;i ++) {
			x = sc.nextDouble();
			u = sc.next();
			if(u.equals("JPY")) sum += x;/*JPY.add(x);*/ 
			else BTC.add(x);
		}
		
		for(int i = 0;i < BTC.size();i ++) {
			sum += BTC.get(i) * 380000;
		}
		System.out.println(sum);
	}