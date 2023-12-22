import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int pro1=0;
		int pro2=0;
		int pro3=0;
		
		for (int i=0; i<N; i++){
			int num = sc.nextInt();
			if (num<=A){
				pro1++;
			}else if(num>=B+1){
				pro3++;
			}else{
				pro2++;
			}
		}
		int ans = Math.min(pro3, Math.min(pro1, pro2));
		System.out.println(ans);
	}

}