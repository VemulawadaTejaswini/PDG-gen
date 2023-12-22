
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner cin = new Scanner(System.in)) {
			String S = cin.next();
			
			int lastIndex = S.length();
			int search = S.length()-4;
			int count = 0;
			for(int j = lastIndex;j>3;j--) {
				for(int i = search;i>=0;i--) {
					StringBuilder sb = new StringBuilder(S);
					String s = sb.substring(i,j).toString();
					int a =Integer.parseInt(s);
					if(a>200000) break;
					if(a%2019==0) {
						count++;
					}
					System.out.println(a+","+i+","+j);
				}
				search--;
			}
			
			System.out.println(count);
		}
		
		
	}

}