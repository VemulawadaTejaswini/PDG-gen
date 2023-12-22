import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
        boolean bool[]=new boolean[300];
      for(int i=0;i<str.length();i++)bool[str.charAt(i)-'a']=true;
     int ans=0;
      for(int i=0;i<300;i++)if(bool[i])ans++;
      System.out.println(ans/2);
	}
}
