import java.util.*;

public class Main{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int x[]={a+b,a-b,a*b};

		int max=0;
		for(int i=0;i<3;i++){
			if(max<x[i]){
				max=x[i];
			}
		}
		System.out.println(max);

	}
}
