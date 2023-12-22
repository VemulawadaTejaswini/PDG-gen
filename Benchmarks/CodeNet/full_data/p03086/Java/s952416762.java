
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner sc=new Scanner(System.in);
		input=sc.next();
		int output=0;
		for(int i=0;i<input.length();i++) {
			int temp=0;
			for(int j=i;j<input.length();j++) {
				if(!input.substring(j, j+1).equals("A")&&!input.substring(j, j+1).equals("C")&&!input.substring(j, j+1).equals("G")&&!input.substring(j, j+1).equals("T")) {
					break;
				}else {
					temp++;
				}
			}
			if(temp>output) {
				output=temp;
			}
				
			}
		System.out.println(output);
		}

}
