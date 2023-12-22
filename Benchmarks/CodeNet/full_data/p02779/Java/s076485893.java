import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//10^9=1000000000
		List<Long> c1 = new ArrayList<>();
		List<Long> c2 = new ArrayList<>();
		List<Long> c3 = new ArrayList<>();
		List<Long> c4 = new ArrayList<>();
		List<Long> c5 = new ArrayList<>();
		List<Long> c6 = new ArrayList<>();
		List<Long> c7 = new ArrayList<>();
		List<Long> c8 = new ArrayList<>();
		List<Long> c9 = new ArrayList<>();
		List<Long> c10 = new ArrayList<>();
		for(int i=0;i<n;i++){
			long a = sc.nextLong();
			if(a<100000000){
				if(!comp(c1, a)){
					sc.close();
					return;
				}
			}else if(a<200000000){
				if(!comp(c2, a)){
					sc.close();
					return;
				}
			}else if(a<300000000){
				if(!comp(c3, a)){
					sc.close();
					return;
				}
			}else if(a<400000000){
				if(!comp(c4, a)){
					sc.close();
					return;
				}
			}else if(a<500000000){
				if(!comp(c5, a)){
					sc.close();
					return;
				}
			}else if(a<600000000){
				if(!comp(c6, a)){
					sc.close();
					return;
				}
			}else if(a<700000000){
				if(!comp(c7, a)){
					sc.close();
					return;
				}
			}else if(a<800000000){
				if(!comp(c8, a)){
					sc.close();
					return;
				}
			}else if(a<900000000){
				if(!comp(c9, a)){
					sc.close();
					return;
				}
			}else{
				if(!comp(c10, a)){
					sc.close();
					return;
				}
			}
		}
		sc.close();
		System.out.println("YES");
	}
	private static boolean comp(List<Long> c, long a){
		if(c.contains(a)){
			System.out.println("NO");
			return false;
		}else{
			c.add(a);
		}
		return true;
	}
}