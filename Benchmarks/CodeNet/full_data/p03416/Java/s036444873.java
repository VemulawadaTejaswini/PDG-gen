import java.util.*;
public class Main{
	public static void main(String[] args){
		//10000<=A<=B<=99999
		//
		//回文数とは逆から読んでも同じ数のこと
		//AからBまでを配列に入れていく
		//AからBまでは0から数えてB-A個ある
		//
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ba[] = new String[b-a+1];//b-a個に1をプラスしたのは０の時1個配列作られないから	 
		String mozireverse;
		int count = 0;
		for(int i = 0;i <= b-a+1;i++){

			ba[i] = String.valueOf(a);
			a++;

		}

		//５桁だから中身を逆にして比較
		for(int i = 0;i <= b-a+1;i++){
	
			 StringBuffer sb = new StringBuffer(ba[i]);
       			 mozireverse = sb.reverse().toString();
			 //System.out.println(ba[i]);
			 //System.out.println(mozireverse);
			 if(ba[i].equals(mozireverse)){//カウント
				 
				count++;

			 }
	
		}

		System.out.println(count*2);
				


		
		
	
	}
}
