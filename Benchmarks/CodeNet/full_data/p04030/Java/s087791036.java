import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		String s=stdin.next();
		char c[]=s.toCharArray();
		int i;
		StringBuilder sb=new StringBuilder();
		for(i=0;i<c.length;i++){
			if(c[i]=='0')
				sb.append(0);
			else if(c[i]=='1')
				sb.append(1);
			else if(c[i]=='B'){
				int last=sb.length()-1;
				if(last>-1)
					sb.deleteCharAt(last);
			}
			//System.out.println(sb);
		}
	}
}