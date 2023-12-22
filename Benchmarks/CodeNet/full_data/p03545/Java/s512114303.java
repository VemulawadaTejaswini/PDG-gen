import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		String abcd = sc.next();
		int a = Integer.parseInt(abcd.substring(0, 1));
		int b = Integer.parseInt(abcd.substring(1, 2));
		int c = Integer.parseInt(abcd.substring(2, 3));
		int d = Integer.parseInt(abcd.substring(3, 4));

		for(int v=0; v<=36; v++) {
			int wa=a;
			int wb=b;
			int wc=c;
			int wd=d;
			for(int i=0; i<2; i++) {
				wb=-wb;
				for(int j=0; j<2; j++) {
					wc=-wc;
					for(int k=0; k<2; k++) {
						wd=-wd;
						if(wa+wb+wc+wd==v) {
							System.out.print(a);
							String sign="+";
							if(wb<0) {
								sign="-";
							} else {
								sign="+";
							}
							System.out.print(sign);
							System.out.print(b);
							if(wc<0) {
								sign="-";
							} else {
								sign="+";
							}
							System.out.print(sign);
							System.out.print(c);
							if(wd<0) {
								sign="-";
							} else {
								sign="+";
							}
							System.out.print(sign);
							System.out.print(d);
							System.out.println("="+v);
							sc.close();
							return;
						}
					}
				}
			}
		}
		sc.close();
	}

}
