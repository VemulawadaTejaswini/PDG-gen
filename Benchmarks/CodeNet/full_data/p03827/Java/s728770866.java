import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		int x=0;
		int max=0;
		int N = sc.nextInt();
		String S = sc.next();
		for(int i=1;i<N;i++){
			char s = S.charAt(i);
			if(s=='I'){
				x=x+1;
			}else if(s=='D'){
				x=x-1;
			}
			if(max-x<0){
				max=x;
			}		
		}
		System.out.println(max);
	}

}
