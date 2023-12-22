import java.util.*;
class Main{
	public static void main(String[] argv){
		yard();
	}
	static Scanner scan = new Scanner(System.in);
	public static void yard(){
		int a = scan.nextInt(), b = scan.nextInt();
		int area = (a-1)*(b-1);
		System.out.println(area);
	}
	
}