import java.util.*;
class Main{
	static Scanner scan = new Scanner(System.in);
	static void crackers(){
		int n = scan.nextInt(), k = scan.nextInt();
		if(n/k==0)
			int m = 0;
		else
			int m = 1;
		System.out.println(m);
	}
	public static void main(String[] argv){
		crackers();
	}
}