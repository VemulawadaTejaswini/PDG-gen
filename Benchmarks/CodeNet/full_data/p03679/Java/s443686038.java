import java.util.Scanner;
public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	public static void main(String[]__){
		int x=getInt(),a=getInt(),b=getInt();
		System.out.println(b-a<=0?"delicious":b-a<=x?"safe":"dangerous");
	}
}
