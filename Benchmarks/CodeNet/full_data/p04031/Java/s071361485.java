import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> caca = new ArrayList<Integer>();
		int suma = 0;
		for(int i = scn.nextInt();i>0;i--) {
			int n1 = scn.nextInt();
			caca.add(n1);
		}
		long tot = 0;
		long min = Long.MAX_VALUE;
		for(int i2 = -100;i2<=100;i2++) {
			for(int i = 0;i<caca.size();i++) {
				tot+=Math.pow(i2-caca.get(i), 2);
				if(tot>min) {
					break;
				}
			}
			if(tot<min)min = tot;
			tot = 0;
		}
		System.out.println(min);
		scn.close();
	}
}