import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		String[] kai= {"KIH","B","R"};
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0; i<16; i++) {
			String gousei="";
			int tmp=i;
			for(int j=0; j<4; j++) {
				if(tmp%2==1) {
					gousei=gousei+"A";
				}
				if(j<3) {
					gousei=gousei+kai[j];
				}
				tmp/=2;
			}
			if(s.equals(gousei)) {
				pl("YES");
				System.exit(0);
			}
		}
		pl("NO");
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
