import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int ans=0;
		for(int i=0;i!=a+1;i++) {
			for(int j=0;j!=a+1;j++) {
				for(int k=0;k!=a+1;k++) {
					if(i+j+k==b) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}