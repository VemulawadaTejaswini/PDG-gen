import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		sc.close();
		double tmp = 0;
		double ans = 0;
		List<Double> maxList = new ArrayList<>();
		if(N > 1){
			for(double a = 2; a < Math.sqrt(N) ; a++){
				double targetNum = a;
				while(targetNum < N){
					tmp = targetNum;
					targetNum = targetNum * targetNum;
				}
				maxList.add(tmp);
			}
			Collections.sort(maxList);
			ans = maxList.get(maxList.size()-1);			
		}else{
			ans = 1;
		}
		System.out.println((int)ans);
	}
}
