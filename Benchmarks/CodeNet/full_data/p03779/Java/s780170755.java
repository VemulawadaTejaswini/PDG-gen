import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int X = Integer.parseInt(in.next());
		int ans = 0;
		for (int i = 1; i < (1000000); i++){
			if( ((i*i+i)/2) >= X){
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}