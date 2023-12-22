import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		
		long L2019 = L%2019;
		long R2019 = R%2019;
		//System.out.println("L2019+\" \"+R2019: "+L2019+" "+R2019);
		if(L-L2019 != R-R2019 || L2019 == 0 || R2019 == 0) {
			System.out.println("dfs");
			System.out.println(0);
			System.exit(0);
		}
		
		
		long min1 = 2018;
		long min2 = 2018;
		/*for(long i= L2019; i <= R2019; i++) {
			long num = i % 2019;
			if(num < min1) {
				min2 = min1;
				min1 = num;
				System.out.println(i+"minA"+min1+" "+min2);
				if(min1 == 0)break;
				
			} else if (num < min2){
				min2 = num;
				System.out.println(i+ "minB"+min1+" "+min2);
			} else {
				continue;
			}
		}*/
		
		System.out.println((L2019* (L2019+1)) % 2019);
	}

}
