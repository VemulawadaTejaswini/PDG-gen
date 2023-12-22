import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= Integer.parseInt(sc.next());
		String S =sc.next();
		char[] c = S.toCharArray();
		int check=1;
		if(N%2==0){
			for(int i=0;i<N/2;i++){
				if(c[i]!=c[i+N/2]){
					check=0;
					break;
				}
			}

			if(check==1){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
		}

	}

}