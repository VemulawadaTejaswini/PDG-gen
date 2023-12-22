import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		long A=1,B=1,min=N;
		while(A<=Math.sqrt(N)){
			if(N%A==0){
				B=N/A;
				String a=String.valueOf(A);
				String b=String.valueOf(B);
				if(a.length()<=b.length()){
					if(min>b.length())
						min=b.length();
				}
				else
					if(min>a.length())
						min=a.length();
			}
			A++;
		}
		System.out.println(min);
	}
}