import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int N=in.nextInt();
		int K=in.nextInt();
		int res;
		if (N==1)
			res=K;
		else if(N==2){
			res=K* ((N-1)*(K-1));
		}else
			res=K* (((N-1)*(K-1))+(K-1));
		System.out.println(res);
	}
}