import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int use =0;
		int sum =0;
		for(int i=N;i>0;i--){
			for(int j=1;j<5;i++){
				int na=i;
				i=i/10;
				use+=i%10;
			}
			if(use>A&&use<B){
				sum+=i;
			}
			use=0;
		}
		System.out.println(sum);
		
	}

}
