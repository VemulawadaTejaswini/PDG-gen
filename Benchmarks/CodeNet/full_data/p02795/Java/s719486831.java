import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		int N=stdIn.nextInt();
		int min=100000;
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				int a=i*W;
				a+=(H-i)*j;
				if(a>=N&&i+j<min)
					min=i+j;
			}
		}
		System.out.println(min);
	}
}
