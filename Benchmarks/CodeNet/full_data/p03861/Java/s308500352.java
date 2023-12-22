import java.util.*;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		Long x = sc.nextLong();
		Long count;
		Long sum1 = a/x;
		if(sum1%x==0){
			sum1=sum1-1;
		}
		long sum2 = b/x;
		count = sum2-sum1;
		System.out.print(count);
		
	}

}
