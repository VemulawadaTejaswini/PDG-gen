import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int Total=0;
        if(N>K) {
        	Total=(K*X)+(N-K)*Y;
        	System.out.println(Total);
        }else {
        	Total=N*X;
        	System.out.println(Total);
        }
	}

}
