import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int[][] a= {{1,3,5,7,8,10,12},{4,6,9,11},{2}};
		int x=sc.nextInt();
		int y=sc.nextInt();
		for(int i=0;i<3;++i) {
			for(int v:a[i]) {
				if(v==x)x=i;
				if(v==y)y=i;
			}
		}
		System.out.println(x==y?"Yes":"No");
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
