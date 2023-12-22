import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();
		String S = scan.nextLine();
		S = scan.nextLine();

		int a = 0;
		int b = 0;
		for(int i=0;i<N;i++){
			String s = S.substring(i, i+1);
			if(s.equals("a")){
				if(a+b<A+B){
					System.out.println("Yes");
					a++;
				}else{
					System.out.println("No");
				}
			}else if(s.equals("b")){
				if((a+b<A+B)&&(b<B)){
					System.out.println("Yes");
					b++;
				}else{
					System.out.println("No");
				}
			}else{
				System.out.println("No");
			}
		}
	}
}