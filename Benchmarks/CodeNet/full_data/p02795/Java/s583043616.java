import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt(),W=sc.nextInt(),N=sc.nextInt();
		int sum = 0;
		if(H>=W) {
			for(int i=1;i<=W;i++) {
				if(H*i>=N) {
					sum = i;
					break;
				}
			}
		}else {
			for(int i=1;i<=H;i++)
				if(W*i>=N) {
					sum = i;
					break;
				}
		}
		System.out.print(sum);
	}
}
