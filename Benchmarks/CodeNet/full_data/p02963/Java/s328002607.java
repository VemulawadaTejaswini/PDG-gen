import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long s=sc.nextLong();
		long cc=2;
		long x=0;
		long y=0;
		while(true){
			if(s%cc==0){
				x=cc;
				y=s/cc;
				break;
			}
			cc++;
		}
		System.out.print(1+" "+1+" "+(1+x)+" "+1+" "+1+" "+(1+y));
		
	}
}


