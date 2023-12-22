import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n=scan.next();
		scan.close();

		System.out.println(func(n,n.length())+1);
	}

	static long func(String n , int len) {
		if(len<=0)return 0;
		int num=Character.getNumericValue(n.charAt(len-1));
		if(num<5)return num + func(n,len-1);
		else return 10-num+func(n,len-1);
	}
}