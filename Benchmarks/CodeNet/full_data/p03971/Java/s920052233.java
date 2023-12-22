import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		int c = 0, d = 0;

		for(int i=0; i<n; i++){
			if(s.charAt(i)=='a'){
				if(c<a+b){
					System.out.println("Yes");
					c++;
				}else{
					System.out.println("No");
				}
			}else if(s.charAt(i)=='b'){
				if(c<a+b&&d<b){
					System.out.println("Yes");
					c++;
				}else{
					System.out.println("No");
				}
				d++;
			}else{
				System.out.println("No");
				continue;
			}
		}
	}
}