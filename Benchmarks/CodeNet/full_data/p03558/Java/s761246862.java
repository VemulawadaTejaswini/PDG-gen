import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long k = sc.nextInt();

		long grade=String.valueOf(k).length();

		String str = String.valueOf(k);
		long sum=0;
		for(int i=0;i<str.length();i++){
			sum+=Integer.parseInt(str.substring(i, i+1));
		}

		long n=k;
		long m=2;
		while(grade<=sum){
			n=k*m;
			long tmp=0;
			str = String.valueOf(n);
			for(int i=0;i<str.length();i++){
				try{
					tmp+=Integer.parseInt(str.substring(i, i+1));
				}catch(NumberFormatException e){
				}
			}
			grade=String.valueOf(n).length();
			if(sum>tmp)sum=tmp;
			m++;
		}
		System.out.println(sum);




	}

}
