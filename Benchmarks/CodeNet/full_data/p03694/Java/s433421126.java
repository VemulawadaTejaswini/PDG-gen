import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int min;
		int max;
		int a = in.nextInt();
		min = a;
		max = a;
		for(int i=0; i<N-1; i++){
			a = in.nextInt();
			if(min > a){
				min = a;
			}
			if(max < a){
				max = a;
			}
		}
			System.out.print(max - min);
		
	}
}
