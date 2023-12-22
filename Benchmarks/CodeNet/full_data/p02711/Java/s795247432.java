import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String  str = scan.next();
		boolean flag = false;

		if(str.charAt(0)=='7')flag=true;
		if(str.charAt(1)=='7')flag=true;
		if(str.charAt(2)=='7')flag=true;

		System.out.println((flag)?"Yes":"No");
	}
}