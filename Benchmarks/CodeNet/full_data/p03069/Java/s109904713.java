import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String S=sc.next();
		int wcount=0,bcount=0,ans=0;
		
		for(int i=0;i<N;i++) {
			if(S.charAt(i)== '#') {
				bcount++;
			}else{
				wcount++;
			}
		}
		ans=Math.min(bcount, wcount);
		
		System.out.println(ans);
		

	}

}
