import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner bui = new Scanner(System.in);
		String s = bui.next();


		int max=0;
		int count = 0;
		String maxs="";
		for(int i=0;i<s.length();i++) {
			switch(s.charAt(i)) {
			case'A':
				count++;
				break;
			case'C':
				count++;
				break;
			case'G':
				count++;
				break;
			case'T':
				count++;
				break;
			default:
				if(max<count) {
					max = count;
					maxs = s.substring(i-count, i);
				}
				count=0;
				
				break;
			}



		}

		System.out.println(maxs);

	}
}
