import java.util.Scanner;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int v=Integer.parseInt(s.next()+s.next());
		System.out.println(
				Math.pow((int)Math.sqrt(v),2)==v?"Yes":"No"
				);
	}
}