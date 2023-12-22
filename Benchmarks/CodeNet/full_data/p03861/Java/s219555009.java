import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(),b=sc.nextLong(),x=sc.nextLong();
		if(a==0) {
			System.out.println((long)(b/x)+1);
		}else if(a==1){
			System.out.println((long)(b/x)-(long)(1/x));
		}else {
			System.out.println((long)(b/x)-(long)((a-1)/x));
		}


	}
	public static int sample(int n) {
		return n;
	}

}
