import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),K=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<N;i++){
			int res=sc.nextInt();
			int count=sc.nextInt();
			sc.nextInt();
			K-=count;
			if(K<=0){
				System.out.println(res);
				break;
			}
		}
			
	}
}
