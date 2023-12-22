import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		String s=stdin.next();
		int l=s.length();
		int i,j;
		int friend=0;
		boolean flag=true;
		char c[]=s.toCharArray();
		for(i=0;i<c.length;i++){
			for(j=0;j<c.length;j++)
				if(c[i]==c[j])
					friend++;

		if(friend%2!=0)
			flag=false;
		}
		if(flag)
			System.out.println("Yes");
		else if(!flag)
			System.out.println("No");
	}
}