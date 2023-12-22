import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N =Integer.parseInt(in.next());
		int A =Integer.parseInt(in.next());
		int B =Integer.parseInt(in.next());
		System.out.println(Math.min(B,N*A));
	}
}