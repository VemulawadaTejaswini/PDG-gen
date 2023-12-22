import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
      Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int N=S.length(),i=N;
		while(true){
			if(i==0){
				System.out.println("YES");
				System.exit(0);
			}
			if(i<5){
				System.out.println("NO");
				System.exit(0);
			}
			String a=S.substring(i-5,i);
			if(a.equals("dream")||a.equals("erase")){
				i-=5;continue;
			}
			if(i==0){
				System.out.println("YES");
				System.exit(0);
			}
			if(i<6){
				System.out.println("NO");
				System.exit(0);
			}
			a=S.substring(i-6,i);
			if(a.equals("eraser")){
				i-=6;continue;
			}
			if(i==0){
				System.out.println("YES");
				System.exit(0);
			}
			if(i<7){
				System.out.println("NO");
				System.exit(0);
			}
			a=S.substring(i-7,i);
			if(a.equals("dreamer")){
				i-=7;continue;
			}
			if(i==0){
				System.out.println("YES");
				System.exit(0);
			}
			System.out.println("NO");
			System.exit(0);
		}
	}
}
