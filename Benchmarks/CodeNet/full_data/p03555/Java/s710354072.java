import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		char[][] c=new char[2][3];
		for(int i=0;i<2;++i) {
			c[i]=sc.next().toCharArray();
		}
		boolean flag=true;
		for(int i=0;i<2;++i) {
			for(int j=0;j<3;++j) {
				flag&=c[i][j]==c[1-i][2-j];
			}
		}
		System.out.println(flag?"YES":"NO");
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
