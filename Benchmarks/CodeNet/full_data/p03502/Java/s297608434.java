import java.util.Scanner;
class Main{
	public static void main(String[]$){
		int v=gInt();
		int m=(""+v).chars().map(i->i-'0').sum();
		System.out.println(v%m==0?"Yes":"No");
	}
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}
}