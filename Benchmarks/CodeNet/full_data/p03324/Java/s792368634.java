import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(), n = sc.nextInt();
		int sum=0,count=0,flag=0,max=-999999,min=99999;
		//String[] array = new String[N];
		//String s=sc.next(),t=sc.next(),buff="";
		if(d==0) {
			if(n!=100)System.out.println(n);
			else System.out.println(n+1);
		}else if(d==1) {
			if(n!=100)System.out.println(n*100);
			else System.out.println((n+1)*100);
		}else {
			if(n!=100)System.out.println(n*10000);
			else System.out.println((n+1)*10000);
		}
		/*if(Integer.parseInt(s)%sum==0) {
			System.out.println("Yes");//Yes or YES注意
		}else {
			System.out.println("No");
		}*/

		//System.out.println("No");

	}
	public static int sample(int n) {
		return n;
	}

}
