import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=9;++i) {
			for(int j=1;j<=9;++j) {
				if(i*j==n) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
