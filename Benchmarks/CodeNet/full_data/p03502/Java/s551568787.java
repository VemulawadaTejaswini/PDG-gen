import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String N = in.next();
		int n = Integer.parseInt(N);
		int temp = 0;
		for(int i = 0; i < N.length(); i++){
			temp += Integer.parseInt(String.valueOf(N.charAt(i)));
		}
		if(n % temp == 0)System.out.println("Yes");
		else System.out.println("No");
	}
}