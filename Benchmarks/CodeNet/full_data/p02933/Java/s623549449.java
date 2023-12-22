import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int[]arr=new int[N];
		for(int index=0;index<N;index++) {
			arr[index]=scanner.nextInt();
		}
		double newgred=0;
		double maxgred=Double.MIN_VALUE;
		for(int index=0;index<N;index++) {
			newgred=(1.0*(arr[(index+1+N)%N]+arr[(index+2+N)%N])/2);
			newgred=1.0*Math.round(newgred*100000)/100000;
			int j=index+2;
			while((j+N)%N!=index) {
				j++;
				newgred=1.0*(newgred+arr[(j+N)%N])/2;
				newgred=1.0*Math.round(newgred*100000)/100000;
				
			}
			if(maxgred<newgred) {
				maxgred=newgred;
			}
		}
		System.out.println(1.0*Math.round(100000*maxgred)/100000);
	}
}
