import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		//List<Integer> list=new ArrayList<Integer>();
		int xx=x*h;
		int xxx=(w-x)*h;
		int yy=w*y;
		int yyy=w*(h-y);
		int flag=0;
		if(x==0&&y==0) {
			System.out.println((w*h)/2);
			flag=1;
		}
		else if(x==0&&y==h) {
			System.out.println((w*h)/2);
			flag=1;
		}
		else if(x==w&&y==h) {
			System.out.println((w*h)/2);
			flag=1;
		}
		else if(x==w&&y==0) {
			System.out.println((w*h)/2);
			flag=1;
		}


		if(xx>xxx) {
			xx=xxx;
		}

		if(yy>yyy) {
			yy=yyy;
		}

		if(xx>yy&&flag==0) {
			System.out.println(xx);
		}
		else if(yy>xx&&flag==0) {
			System.out.println(yy);
		}

		else if(xx==yy&&flag==0) {
			System.out.println(xx);
		}

		if(xx==yy&&flag==0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}



	}

}
