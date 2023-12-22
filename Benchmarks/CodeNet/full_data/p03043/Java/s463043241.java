import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int genzai = 0;
		double result = 1d/(double)n;
		double ans = 0;
		ArrayList<Double> arr=new ArrayList<>();
		if(n==1) {
			result =0;
		}else {
			for(int i=1;i<=n;i++) {
				genzai = i;
				while(true) {
					if(genzai>=k) {
						arr.add(result);
						result = 1d/(double)n;;
						break;
					}
					genzai=genzai*2;
					result=result*0.5d;
				}
			}
			for(double d:arr) {
				ans+=d;
			}
		}
		System.out.println(ans);
	}
}