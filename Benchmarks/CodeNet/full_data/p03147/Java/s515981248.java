import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n =sc.nextInt();
		int h[]=new int[n];

		int count=0;
		boolean start=false;


		for(int i=0;i<n;++i){
			h[i]=sc.nextInt();
		}

		for(int num=1;num<=100;++num){
			start=false;
			for(int i=0;i<n;++i){
				if(h[i]!=0){
					if(start==false){
						start =true;
						++count;
					}
					h[i]=h[i]-1;
				}
				else start=false;
			}
		}

		System.out.println(count);


	}
}