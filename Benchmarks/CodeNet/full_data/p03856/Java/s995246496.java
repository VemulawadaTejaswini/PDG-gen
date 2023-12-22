import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
      Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int N=S.length(),i=N;
		while(true){
			if(i==0){
				System.out.println("Yes");
				System.exit(0);
			}
			if(i<5){
				System.out.println("No");
				System.exit(0);
			}
			String a=S.substring(i-5,i);
			if(a.equals("dream")||a.equals("erase")){
				S=S.substring(0,i-5);i-=5;continue;
			}
			if(i==0){
				System.out.println("Yes");
				System.exit(0);
			}
			if(i<6){
				System.out.println("No");
				System.exit(0);
			}
			a=S.substring(i-6,i);
			if(a.equals("eraser")){
				S=S.substring(0,i-6);i-=6;continue;
			}
			if(i==0){
				System.out.println("Yes");
				System.exit(0);
			}
			if(i<7){
				System.out.println("No");
				System.exit(0);
			}
			a=S.substring(i-7,i);
			if(a.equals("dreamer")){
				S=S.substring(0,i-7);i-=7;continue;
			}
			if(i==0){
				System.out.println("Yes");
				System.exit(0);
			}
			System.out.println("No");
			System.exit(0);
		}
	}
}