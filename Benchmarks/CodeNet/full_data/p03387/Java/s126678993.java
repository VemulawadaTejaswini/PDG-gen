import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int diffe_ab=Math.abs(a-b);
		int diffe_bc=Math.abs(c-b);

		if(diffe_ab<diffe_bc){
			//diffe_abの方を大きい数にする
			int tmp=diffe_ab;
			diffe_ab=diffe_bc;
			diffe_bc=tmp;
		}

		int ans=0;

		if(diffe_ab%2==0 && diffe_bc%2==0){
			//両方偶数
			ans=(diffe_ab+diffe_bc)/2;
		}else if(diffe_ab%2==1 && diffe_bc%2==1){
			//両方奇数
			ans= (diffe_ab-1)/2+(diffe_bc-1)/2+1;
		}else if(diffe_ab%2==0 && diffe_bc%2==1){
			//大きい数が偶数
			ans=diffe_ab/2+(diffe_bc+1)/2+1;
		}else if(diffe_ab%2==1 && diffe_bc%2==0){
			//奇数の方が大きい
			ans= (diffe_ab-1)/2+3;
		}

		System.out.println(ans);

	}
}