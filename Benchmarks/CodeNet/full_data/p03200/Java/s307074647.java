import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		boolean[] start = new boolean[a.length()];
		for(int i = 0; i < a.length();i++){
			start[i] = 'B' == a.charAt(i);
		}
		int count = 0;
		int wnum = 0;
		for(int i = 0; i < a.length() -1 ;i++){
			if (start[i] ) wnum ++;
			if (start[i] && !start[i+1]){
				count += wnum;
			}
		}

		System.out.println(count);
	}
}
