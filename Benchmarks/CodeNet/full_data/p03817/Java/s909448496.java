import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x = n/11;
		long y = n%11;
		if(n<=6){
			System.out.print(1);
		}else if(n<=11)
			System.out.print(2);
		else{
			x*=2;
			if(y%6==2||y%6==5){
				x+=2;
			}else
				x+=1;
			System.out.print(x);
		}
	}
}
