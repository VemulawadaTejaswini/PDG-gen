import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}

	public static void main(String[]$){
		int a=gInt(),b=gInt(),c=gInt();
		System.out.println(
				a+b>=c&&a<=c
				?"YES":"NO"
				);
	}
}