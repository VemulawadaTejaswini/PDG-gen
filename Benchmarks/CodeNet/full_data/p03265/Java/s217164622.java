import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();

		int x4=-y2+y1+x1;
		int y4=x2-x1+y1;
		int x3=x2+x4-x1;
		int y3=y2+y4-y1;
		System.out.println(x3+" "+y3+" "+x4+" "+y4);
	}
}