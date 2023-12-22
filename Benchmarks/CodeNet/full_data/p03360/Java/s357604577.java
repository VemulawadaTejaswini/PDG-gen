import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b < a)
			System.out.println(a-1);
		else
			System.out.println(a);
			*/
		//B
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		for(int i = 0 ; i < k ; i++){
			int max = a;
			int max_index = 0;
			if(max < b){
				max = b;
				max_index = 1;
			}
			if(max < c){
				max = c;
				max_index = 2;
			}
			switch(max_index){
				case 0: a*=2;
				case 1: b*=2;
				case 2: c*=2;
			}
		}
		System.out.println(a+b+c);
	}
}
