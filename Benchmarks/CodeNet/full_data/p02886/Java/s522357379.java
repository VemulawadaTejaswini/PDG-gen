import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int d[] = new int[N];
        int sum =0;

        for(int i=0;i<N;i++) {
        	d[i] = stdin.nextInt();
        }
        for(int i=0;i<N-1;i++) {
        	for(int j=i+1;j<N;j++) {
        		sum += d[i]*d[j];
        	}
        }
        System.out.println(sum);
	}
}
