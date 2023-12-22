import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		long ans = 0;
		
		while(k>0) {
			ans++;
			int[] digits = new int[(int) Math.log10(ans)+1];
			long tempans = ans;
			for(int i=0;i<digits.length;i++) {
				digits[i] = (int) (tempans/Math.pow(10, digits.length-i-1));
				tempans = (long) (tempans - digits[i]*Math.pow(10, digits.length-i-1));
			}
			boolean check = true;
			for(int i =0;i<digits.length-1;i++) {
				if(Math.abs(digits[i]-digits[i+1])>1) {
					check=false;
					break;
				}
			}
			if(check)k--;
		}
		System.out.println(ans);
	}





}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
