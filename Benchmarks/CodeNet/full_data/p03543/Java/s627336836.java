import java.util.Scanner;
class GoodInteger{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		//1000
		int x1 = 0;
		//100
		int x2 = 0;
		//10
		int x3 = 0;
		while(x>=1000){
			x-=1000;
			x1++;
		}
		while(x>=100){
			x-=100;
			x2++;
		}
		while(x>=10){
			x-=10;
			x3++;
		}
		if(x1==x2 && x2==x3){
			System.out.println("Yes");
		}else if (x2==x3 && x2 == x){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
