import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> caca = new ArrayList<Integer>();
		Scanner scn = new Scanner(System.in);
		String din = scn.next();
		int din2 = Integer.parseInt(din);
		for(int i = scn.nextInt();i>0;i--) {
			caca.add(scn.nextInt());
		}for(int i = din.length()-1;i>=0;i--) {
			if(caca.contains((int)(din2/(1*(Math.pow(10,din.length()-i-1))))%10)) {
				din2+=(Math.pow(10,din.length()-i-1));
			}
		}din = Integer.toString(din2);
		for(int i = din.length()-1;i>=0;i--) {
			if(caca.contains((int)(din2/(1*(Math.pow(10,din.length()-i-1))))%10)) {
				din2+=(Math.pow(10,din.length()-i-1));
			}
		}
		System.out.println(din2);
		scn.close();
	}
}