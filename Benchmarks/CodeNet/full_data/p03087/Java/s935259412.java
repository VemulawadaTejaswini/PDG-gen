import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s=sc.next();
		for(int i=0;i<b;i++){
			int c=0;
			int m=sc.nextInt();
			int n=sc.nextInt();
			for(int j=m-1;j<n-1;j++){
				if(s.charAt(j)=='A'&&s.charAt(j+1)=='C')
					c++;
			}
			System.out.println(c);
		}
	}
}