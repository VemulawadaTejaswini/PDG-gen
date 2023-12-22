import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		int n = 0;
		for(int i = 0 ; i < a.length(); i++){
			if(a.charAt(i) == '2') n++;
		}
		System.out.println(n);
	}
}
