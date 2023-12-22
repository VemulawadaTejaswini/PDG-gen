
import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		int B[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			B[A[i]-1]++;
		}
		long ans=0;
		for(int i=0;i<N;i++) {
			ans+=calcNumOfCombination(B[i],2);
		}
		for(int i=0;i<N;i++) {
			System.out.println(ans-calcNumOfCombination(B[A[i]-1], 2)+calcNumOfCombination(B[A[i]-1]-1, 2));
		}

	}
	public static int calcNumOfCombination(int n, int r){
		if(n==0||n==1) {
			return 0;
		}else {
        int num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;}
    }
}
