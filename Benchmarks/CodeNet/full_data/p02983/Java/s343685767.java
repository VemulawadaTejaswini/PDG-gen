import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);

		int L=sc.nextInt();
		int R=sc.nextInt();
		int hikaku=0;
		long result=(long)Math.pow(20,9);
		
		for(int i=L;i<=R-1;i++)  {
				hikaku=(i*(i+1))%2019;
				if(result>hikaku) {
					result=hikaku;
				}
			}
		System.out.println(result);
	}

}
