import java.util.Arrays;
import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int K=sc.nextInt();
	long H[]=new long[N];
	for(int i=0;i<N;i++) {
		H[i]=sc.nextLong();
	}
	Arrays.sort(H);
	long sum=0;
	if(N-K>0) {
	for(int i=0;i<N-K;i++) {
		sum+=H[i];
	}}
	System.out.println(sum);


}
}