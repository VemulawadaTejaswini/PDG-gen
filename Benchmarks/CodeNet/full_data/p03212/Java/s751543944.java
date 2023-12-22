import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int sum = f753(0,false,false,false,N);
		System.out.println(sum);
	}
	
	public static int f753(long x,boolean c7,boolean c5,boolean c3,int N) {
		int res = 0;
		
		if(x> N) {
			return res;
		}
		if(c7&&c5&&c3) {
			res++;
		}
		
		res += f753(x * 10 +7,true,c5,c3,N);
		res += f753(x * 10 +5,c7,true,c3,N);
		res += f753(x * 10 +3,c7,c5,true,N);
		return res;
	}

}