import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int y = sc.nextInt();
		if(y>10000*n) {
			System.out.println("-1 -1 -1");
			System.exit(0);
		}
		for(int im=0;n+1>im;im++) {
			int x=0;
			x=(10000*im);
			if(x==y&&im==n) {
				System.out.println(String.valueOf(im)+" "+"0"+" "+"0");
				System.exit(0);
			}
			for(int gs=0;n+1-im>gs;gs++) {
				x=0;
				x=(10000*im)+(5000*gs);
				if(x==y&&im+gs==n) {
					System.out.println(String.valueOf(im)+" "+String.valueOf(gs)+" "+"0");
					System.exit(0);
				}

				for(int s=0;n+1-im-gs>s;s++) {
					x=0;
					x=(10000*im)+(5000*gs)+(1000*s);
					if(x==y&&im+gs+s==n) {
						System.out.println(String.valueOf(im)+" "+String.valueOf(gs)+" "+String.valueOf(s));
						System.exit(0);
					}

				}
			}
		}
		System.out.println("-1 -1 -1");
		//List<Integer> list=new ArrayList<Integer>();

	}

}
