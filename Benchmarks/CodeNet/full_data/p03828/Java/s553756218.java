import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long s = 0;
		for(int i = 1; i < N; i++){
			if(i == 1){
				s = N * i;
			}else{
				s = s * i;
			}
		}
		long count = 0;
		for(int i = 1; i <= s; i++){
			if(s % i == 0)
				count++;
			    count = count % 1000000007;
		}
		System.out.println(count);
	}
}