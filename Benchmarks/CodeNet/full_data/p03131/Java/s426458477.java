import java.util.*;

class Main3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		if(a + 1 < b){
			if(k < a){
				System.out.print(k+1);
			}else{
				long k2 = a - 1;
				long answer = a;
				if((k - k2) % 2 == 1){
					System.out.print((k-k2-1)/2*b+1);
				}else{
					System.out.print((k-k2)/2*(b-a)+k2);
				}
			}
		}else{
			System.out.print(k+1);
		}
	}
}
