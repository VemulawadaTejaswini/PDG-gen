import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Y=sc.nextInt();
		int i,j;
		outside :for( i=0;i<=N;++i) {
			for( j=0;j<=N-i;++j) {
				int c=N-i-j;
				int total=10000*i+5000*j+1000*c;
				if(total==Y) {
					System.out.println(i+j+c);
					break outside;
				}
			}}
		System.out.println("-1 -1 -1");
		
	
	}

}