import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(k < a+1){
			System.out.print(k+1);
		}else{
			if(b-a>2){
				int kc = k-a+1;
				int nok = kc/2;
				if(kc%2==1){
					System.out.print((long)nok*(b-a)+a+1);
				}else{
					System.out.print((long)nok*(b-a)+a);
				}
			}else{
				System.out.print(k+1);
			}
		}
	}
}
