import java.util.*;
public class Main{
static int N= 0;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N =sc.nextInt();
		int data[] =new int[N];
		int max=0;
		for(int i=0;i<N;i++) {
			data[i] = sc.nextInt();
			if(data[i]> max) max=data[i];
			if(i!=0&& data[i]<max-1) {
				System.out.print("No");
				break;
			}
			if(i==N-1)System.out.print("Yes");

		}
		
		
}
}