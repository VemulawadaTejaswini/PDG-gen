import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int max=0;
		int min=1145141919;
		for(int i=0;i<b;i++) {
			int x=scan.nextInt();
			int y=scan.nextInt();
			max=x>max?x:max;
			min=y<min?y:min;
		}
		System.out.println((min-max+1)==0?0:(min-max+1));
	}
}
