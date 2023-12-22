import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		long A[]=new long[5];
		int z=0,ir=1;
		while(z<5){
			A[z]=stdIn.nextLong();
			z++;
		}z=0;
		long y=N/A[0]+1,min=0,miny=N/A[0]+1;
		if(N%A[0]==0){
			y-=1;
			miny-=1;
		}
		min=A[0];
		while(z<5){
			if(A[z]<min){
				if(N%A[z]==0)
					ir=0;
				y+=N/A[z]+ir-miny;
				min=A[z];miny=N/A[z]+ir;
			}
			if(z!=0)
				y++;
			ir=1;
			z++;
		}
		System.out.println(y);
	}
}