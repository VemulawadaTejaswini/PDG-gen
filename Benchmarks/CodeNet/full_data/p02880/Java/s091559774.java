import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		boolean aa=false;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(C==i*j)aa=true;
			}
		}
		if(aa) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		sc.close();
			}
		}