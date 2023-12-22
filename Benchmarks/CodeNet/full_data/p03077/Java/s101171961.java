
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scn=new Scanner(System.in);
		double n=scn.nextDouble();
		double []arr=new double[5];
		double min=n;
		for(int i=0;i<5;i++) {
			arr[i]=scn.nextDouble();
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
			System.out.println(4+Math.floor((n/min))+(n%min!=0?1:0));
		
	}

}
