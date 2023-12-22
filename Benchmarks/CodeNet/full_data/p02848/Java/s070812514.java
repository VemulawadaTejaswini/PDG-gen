import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		char[]c=s.next().toCharArray();
		for(int i=0;i<c.length;++i)
			c[i]=(char)((c[i]-'A'+d)%26+'A');
		System.out.println(c);
	}
}
