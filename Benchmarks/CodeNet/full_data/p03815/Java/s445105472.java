import java.util.*;


class Main{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		long x = Long.parseLong(sc.next());//得点
		long y = 0;//自分の得点
		long count = 0;//操作回数
		
		long check1 = x / 11;//11で割った商
		long check2 = x % 11;//11で割ったあまり
		
		/* ==================================== */
		//check1=0でcheck2が6より小さい場合
		if(check2 < 6 && check1 ==0){
			count = 1;
		}
		
		/* ==================================== */
		//check1=0でcheck2が6以上11より小さい場合
		if(check2 >= 6 && check2 < 11 && check1 ==0){
			count = 2;
		}
		
		/* ==================================== */
		//check1が1以上check2が0の場合
		if(check2 == 0 && check1 >= 1){
			count = 2 * check1;
		}
		
		/* ==================================== */
		//check1が1以上check2が6より小さい場合
		if(check2 != 0 && check2 < 6 && check1 >= 1){
			count = 2 * check1 +1;
		}
		
		/* ==================================== */
		//check1が1以上check2が6以上11より小さい場合
		if(check2 >= 6 && check2 < 11 && check1 >= 1){
			count = 2 * check1 + 2;
		}
		
		
		System.out.println(count);
	}
}