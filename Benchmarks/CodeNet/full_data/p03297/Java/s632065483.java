import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		long a,b,c,d;
		long sum;
		int flag =0;
		ArrayList<Integer> hoge = new ArrayList<Integer>();
		for(int i=0;i<T;i++) {
			a = scanner.nextLong();
			b = scanner.nextLong();
			c = scanner.nextLong();
			d = scanner.nextLong();
			if(i==0)System.out.println();
			sum = a;
			while(true) {
				//hiru
				sum -= b;
				if(sum<0) {
					break;
				} //だめ
				
				//yoru
				if(sum <= c) {
					sum += d;
				}
				if(Arrays.asList(a).contains(sum)) {
		               System.out.println("Yes");
		               flag = 1;
		               break;
		        }
				hoge.add((int)sum);
			}
			if(flag == 0) {
				System.out.println("No");
			}
			flag =0;
			
		}
 	    System.out.println();
	    
	    
		scanner.close();
	}

}
