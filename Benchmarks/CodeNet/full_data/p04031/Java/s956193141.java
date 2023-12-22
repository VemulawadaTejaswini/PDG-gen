import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> caca = new ArrayList<Integer>();
		int suma = 0;
		for(int i = scn.nextInt();i>0;i--) {
			int n1 = scn.nextInt();
			caca.add(n1);
			suma+=n1;
		}
		long tot = 0;
		double med = (double)(suma)/(double)(caca.size());
		double qued = med-(double)((int)med);
		if(qued<=0.5)med=Math.floor(med);
		else med=Math.ceil(med);
		for(int i = 0;i<caca.size();i++) {
			tot+=Math.pow(med-caca.get(i), 2);
		}
		System.out.println(tot);
		scn.close();
	}
}