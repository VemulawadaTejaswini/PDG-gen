import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int z=0,y=0,x=0,x2=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			y+=A[z];
			if(z%2==0){
				if(y<0){
					x+=y*-1+1;
					y=1;
				}
				if(y==0){
					x++;y=1;
				}
			}
			else{
				if(y>0){
					x+=y+1;
					y=-1;
				}
				if(y==0){
					x++;y=-1;
				}
			}
			z++;
		}z=0;y=0;
		while(z<N){
			y+=A[z];
			if(z%2==0){
				if(y>0){
					x2+=y+1;
					y=-1;
				}
				if(y==0){
					x2++;y=-1;
				}
			}
			else{
				if(y<0){
					x2+=y*-1+1;
					y=1;
				}
				if(y==0){
					x2++;y=1;
				}
			}
			z++;
		}
		if(x>=x2)
			System.out.println(x2);
		else
			System.out.println(x);
	}
}