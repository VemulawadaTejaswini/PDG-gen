import java.util.*;

class Main {
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
		// 整数の入力
		long A = sc.nextInt();
		long B = sc.nextInt();
		
		long tmp;
		while ((tmp = A % B) != 0) {
            A = B;
            B = tmp;
        }
		int res = 1;
		if(B > 1) {
			int i = 2;
			while(i <= B) {
				if(B % i == 0) {
					res++;
					B /= i;
					while(B % i == 0) {
						B /= i;
					}
				}
				i++;
			}
			
		}else {
			res = 1;
		}
		// 出力
		System.out.println(res);
    }
}
