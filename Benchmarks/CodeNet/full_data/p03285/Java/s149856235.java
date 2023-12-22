import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	boolean bool=true;
	if(a==1||a==2||a==3||a==5||a==6||a==9||a==10||a==13||a==17) {
		bool=false;
	}
	System.out.println(bool?"Yes":"No");
}
}