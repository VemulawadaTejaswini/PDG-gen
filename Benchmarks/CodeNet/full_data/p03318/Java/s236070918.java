import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong();
		long num = 1;
		for(long i=0;i<K;i++) {
			System.out.println(num);
			if(num<9)
				num++;
			else
				num += 10;
		}
	}
}
