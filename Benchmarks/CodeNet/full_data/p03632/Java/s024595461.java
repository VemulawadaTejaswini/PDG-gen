import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		//開始はaとcのでかいほう
		
		int start=Math.max(a, c);
		int end=Math.min(b,d);
		
		if(end-start>0) {
			System.out.println(end-start);
			
		}else {
			System.out.println(0);
		}

		sc.close();


	}



}

