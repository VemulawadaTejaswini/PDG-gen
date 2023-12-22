import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int X = sc.nextInt();
		List<Integer> dp = new ArrayList<Integer>();
		dp.add(2);
		for (int i = 2; i < 2*X; i++) {
			boolean f = true;
			for(int j=0;j<dp.size();j++) {
				if(i%dp.get(j)==0) {
					f=false;
					break;
				}
			}
			if(f) {
				dp.add(i);
				if(i>X) break;
			}
		}
		System.out.println(X==2 ? 2 :dp.get(dp.size()-1));
	}
}
