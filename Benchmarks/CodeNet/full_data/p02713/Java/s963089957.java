import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws FileNotFoundException{

		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();
		int sum = 0;

		for(int i =1;i<=k;i++) {
			for(int j=1;j<=k;j++) {
				for(int l=1;l<=k;l++) {

			sum += Euqlid(i,Euqlid(j,l));
				}
			}
		}

		System.out.println(sum);
		scan.close();
	}

	public static int Euqlid(int a,int b){

		if(b == 0) {
			return a;
		}else

		return Euqlid(b,a%b);
	}
}
