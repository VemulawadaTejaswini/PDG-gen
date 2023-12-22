import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		if(s.substring(0,n/2).equals(s.substring((n+1)/2,n))){
			if(s.substring(0,(n-1)/4).equals(s.substring((n+1)/4,(n-1)/2))){
			if(s.substring((n+3)/2-1,(1+n-(n+3)/2)/2+(n+3)/2-1).equals(s.substring((2+n-(n+3)/2)/2+(n+3)/2-1,n))){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
		}
	}
}
