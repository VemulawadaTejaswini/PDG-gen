import java.util.*;
public class main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong();
		int sum = 1;
		for(;;){
			if(a*2<=b){
				sum++;
				a*=2;
			}else{
				System.out.println(sum);
				break;
			}
		}
	}
}
