import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		long N = scan.nextLong();

		int root=(int)Math.sqrt((double)N);

		long ansNum=0;
		for(int i=root;i>0;i--){
			if(N%i==0){
				//iで割り切れる
				ansNum=N/i;break;
			}
		}

		for(int i=0;i<11;i++){
			if(ansNum==0){
				System.out.println(i);
				break;
			}
			ansNum/=10;

		}

	}

}
