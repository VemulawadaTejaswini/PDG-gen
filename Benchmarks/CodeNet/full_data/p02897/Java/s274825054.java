import java.util.*;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int counter=1;
		int N= sc.nextInt();
		int a= sc.nextInt();
		int f = 0;
		int count = 0;
		for(int i = 1; i <= N; i++){
			f = i%2;
			if(f == 1){
				count+=1;
			}
		}
		System.out.println((double)counter/N);
	}
}