import java.util.Scanner;

public class Main{
	static int ans = 0;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		String s=sc.next();
		String put="";
		if(s.equals("A"))put="T";
		if(s.equals("C"))put="G";
			if(s.equals("G"))put="C";
			if(s.equals("T"))put="A";
		//for(int i=0;i<n;i++)

		System.out.println(put);
	}
}
