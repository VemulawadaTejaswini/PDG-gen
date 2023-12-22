
import java.util.*;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int total=0;
		int count=0;
		for(int i=0;;i++){
			total+=a;
			count++;
			if(total>=b){
				break;
			}
			total--;
		}
		System.out.println(count);

	}
}
