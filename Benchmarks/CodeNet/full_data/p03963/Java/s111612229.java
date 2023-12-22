import java.util.*;
// . >
class Main{
	static Scanner in = new Scanner(System.in);

	public static void main(String args[]){	
		// String a = in.nextLine();
		int n = scInt(), k = scInt();
		long res = 1;
		for(int i = 0; i < n; i++){
			res *= k;
			k--;
		}
		pl( res + "");
		
	}

	public static int scInt(){return in.nextInt();}
	public static double scDbl(){return in.nextDouble();}
	public static String scStr(){return in.next();}
	public static String scLne(){return in.nextLine();}

	public static void pl(String s){System.out.println(s);}	

}
