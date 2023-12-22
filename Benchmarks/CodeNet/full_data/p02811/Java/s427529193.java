import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt()*500;
		int y=sc.nextInt();
		String s=n>=y?"Yes":"No";
		System.out.println(s);
	}
}