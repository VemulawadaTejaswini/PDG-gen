import java.util.Scanner;
import java.io.*;

class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int sum = 0, min = 100000, tmp, ans = 0;
		for(int i = 0;i < N; i++){
			tmp = sc.nextInt();
			if(tmp < min) min = tmp;
			sum += tmp;
		}
		ans = (int)(X - sum)/min + N;
		System.out.println(ans);
	}
}