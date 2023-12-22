import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String s=sc.next();

		String[] str=s.split("");

		boolean YYMM=true;
		boolean MMYY=true;

		YYMM=check_YYMM(str);

		MMYY=check_MMYY(str);

		if(YYMM && MMYY) System.out.println("AMBIGUOUS");
		else if(YYMM && !MMYY) System.out.println("YYMM");
		else if(!YYMM && MMYY) System.out.println("MMYY");
		else System.out.println("NA");

		sc.close();

	}

	public static boolean check_YYMM(String[] str){
		int MM=Integer.parseInt(str[2]+str[3]);
		if(MM>12) return false;
		if(MM==0) return false;
		return true;
	}

	public static boolean check_MMYY(String[] str){
		int MM=Integer.parseInt(str[0]+str[1]);
		if(MM>12) return false;
		if(MM==0) return false;
		return true;
	}

}
