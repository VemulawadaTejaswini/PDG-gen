
import java.util.*;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		long total=0;
		for(int i=n-1;i>0;i--){
			total+=i;
		}
		System.out.println(total);


	}
}
