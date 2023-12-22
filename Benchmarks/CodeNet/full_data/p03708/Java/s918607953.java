import java.util.*;
public class sample {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		int res;

		if(b >= a){
			res = b -a;
			res = res + res /2;
			system.out.print(res);
		}


	}
}