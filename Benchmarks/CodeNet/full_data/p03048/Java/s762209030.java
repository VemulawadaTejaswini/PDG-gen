import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		
		int count = 0;
		
		for(int i = 0; i *R<=N; i++){
			for(int j = 0; i * R + j * G <=N; j++){
				if((N - (i * R + j * G)) % B ==0) {
					count ++;
				}
			}
		}
		System.out.println(count);
	}
}