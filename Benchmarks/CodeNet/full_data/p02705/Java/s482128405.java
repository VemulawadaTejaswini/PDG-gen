import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		sc.close();

		double ret = getProcess(R);

		System.out.println(ret);
	}

	public static double getProcess(int R){
		double ret = 2 * Math.PI * R ;

		return ret;
	}


}