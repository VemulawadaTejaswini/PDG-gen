import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong(),M=sc.nextLong(),sum=0;
		for(;;){
			if(N>=1&&M>=2){
				N--;
				M-=2;
				sum++;
			}
			else if(N==0&&M>=4){
				sum++;
				M-=4;
			}
			else{
				break;
			}
		}
			System.out.println(sum);
	}
}