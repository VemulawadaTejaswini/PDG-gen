import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		if(a>=3 && b>=3) {
			long res=0l;
			res=(a-2)*(b-2)*1l;
			System.out.println(res);
		}
		else if(a==2 || b==2) {
			System.out.println("0");
		}
		else if(a==1 && b==1){
			System.out.println("1");
		}
		else if(a==1 || b==1) {
			System.out.println(Math.max(Math.max(a-2, b-2),0));
		}
	}
}