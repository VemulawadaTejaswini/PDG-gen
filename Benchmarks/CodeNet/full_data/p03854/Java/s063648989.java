import java.util.ArrayList;
import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input=sc.next();
		String[] type= {"dream","dreamer","erase","eraser"};
		StringBuffer sb=new StringBuffer(input);
		String rinput=sb.reverse().toString();
		boolean can=true;
		for(int i=0;i<rinput.length();) {
			boolean can2=false;
			for(int j=0;j<4;++j) {
				String d=type[j];
				if(rinput.substring(i,d.length())==d) {
					can2=true;
					i+=d.length();
				}
				if(!can2) {
					can=false;
					break;
				}
			}
		}
		
		
		if(can) System.out.println("YES");
		else System.out.println("NO");

	}
}
