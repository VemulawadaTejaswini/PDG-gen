import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		System.out.println(CommonMultipleNum.cmn(num1,num2));
	}
}
class CommonMultipleNum{
	static long cmn(int num1,int num2){
		//総当たり戦。頑張る。
		int tmp;
		int num3 = num1;
		num3 *= num2;//3点交換
		while((tmp= num1%num2)!=0){
			num1 = num2;
			num2 = tmp;
		}
		return (long)(num3/num2);//キャスト(voidとは)
	}
}