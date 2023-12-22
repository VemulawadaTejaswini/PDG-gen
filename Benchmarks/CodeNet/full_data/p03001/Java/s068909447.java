import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int flagx=0;
		int flagy=0;
		//List<Integer> list=new ArrayList<Integer>();
		int xx=x*h;
		int xxx=(w-x)*h;
		int yy=w*y;
		int yyy=w*(h-y);
		if(xx==xxx) {
			flagx=1;
		}
		else if(xx>xxx) {
			xx=xxx;
		}
		if(yy==yyy) {
			flagy=1;
		}
		else if(yy>yyy) {
			yy=yyy;
		}

		if(xx>yy) {
			System.out.println(xx);
		}
		else if(yy>xx) {
			System.out.println(yy);
		}

		else {
			System.out.println(xx);
		}
/*
		if(flagx==1&&flagy==0&&xx>yy) {
			System.out.println("1a");
		}
		else if(flagx==0&&flagy==1&&xx<yy) {
			System.out.println("1b");
		}
		else if(flagx==1&&flagy==1&&xx!=yy) {
			System.out.println("1c");
		}
		*/
		if(flagx==1&&flagy==1&&xx==yy) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}



	}

}
