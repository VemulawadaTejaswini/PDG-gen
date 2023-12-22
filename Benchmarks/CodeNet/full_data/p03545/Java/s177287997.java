import java.util.Scanner;

public class Demo22 {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num/1000;
		int num2 = num%1000/100;
		int num3 = num%100/10;
		int num4 = num%10;
		String[] str =new String[]{"+","-"};
		
		int temp1 = num1 + num2;
		int temp2 = num1-num2;
		
		int temp3 = temp1 + num3;
		int temp4 = temp1 - num3;
		int temp5 = temp2 + num3;
		int temp6 = temp2 - num3;
		
		int temp7 = temp3 + num4;
		int temp8 = temp3 - num4;
		int temp9 = temp4 + num4;
		int temp10 = temp4 - num4;
		int temp11 = temp5 + num4;
		int temp12 = temp5 - num4;
		int temp13 = temp6 + num4;
		int temp14 = temp6 - num4;
		
		if(temp7 == 7){
			System.out.println(num1 +"+"+ num2+"+"+num3 +"+"+ num4+"=7");
		}else if(temp8 == 7){
			System.out.println(num1 +"+"+ num2+"+"+num3 +"-"+ num4+"=7");
		}else if(temp9 == 7){
			System.out.println(num1 +"+"+ num2+"-"+num3 +"+"+ num4+"=7");
		}else if(temp10 == 7){
			System.out.println(num1 +"+"+ num2+"-"+num3 +"-"+ num4+"=7");
		}else if(temp11 == 7){
			System.out.println(num1 +"-"+ num2+"+"+num3 +"+"+ num4+"=7");
		}else if(temp12 == 7){
			System.out.println(num1 +"-"+ num2+"+"+num3 +"-"+ num4+"=7");
		}else if(temp13 == 7){
			System.out.println(num1 +"-"+ num2+"-"+num3 +"+"+ num4+"=7");
		}else if(temp14 == 7){
			System.out.println(num1 +"-"+ num2+"-"+num3 +"-"+ num4+"=7");
		}
		
		
	}

}