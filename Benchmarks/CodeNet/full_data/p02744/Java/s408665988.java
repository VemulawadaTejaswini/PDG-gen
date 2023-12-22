import java.util.*;
import java.lang.Math;

public class Main {
	static String a;
	public static void printans(int x,int y,char[] s) {
		if (x==y) System.out.println(new String(s));
		else 
			for (int i='a';i<s[x]+2;i++) {
				s[x+1]=(char)i;
				printans(x+1,y,s);
			}
	}
		  public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    char a[]=new char [100];
		    a[0]='a';
		    printans(0,n-1,a);
		  }
		}
