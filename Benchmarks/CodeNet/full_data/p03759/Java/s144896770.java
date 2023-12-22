
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String E = sc.next();
		String O = sc.next();
		int cnt=0;
		while(E.length()!=0 || O.length()!=0){
			if(cnt%2==0){
				System.out.print(E.charAt(0));
				E = E.substring(1);
			}
			else{
				System.out.print(O.charAt(0));
				O = O.substring(1);
			}
			cnt++;
		}
		System.out.println("");
	}

}
