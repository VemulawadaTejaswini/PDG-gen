import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int money = sc.nextInt();

		for(int x=0;x<money/10000+1;x++){
			
			for(int y=0;y<(money-10000*x)/5000+1;y++){

				
				int rval = money - (x*10000 + y*5000);
				
				int m = rval/1000;
				

				if((x + y + m) == num){
					answer(x,y,m);
				}
			}
		}
		answer(-1);

	}

	private static void answer(int n){
		System.out.println("-1 -1 -1");
		System.exit(1);
	}

	private static void answer(int a,int b,int c){
		System.out.println(a+" "+b+" "+c);
		System.exit(1);
	}
}
