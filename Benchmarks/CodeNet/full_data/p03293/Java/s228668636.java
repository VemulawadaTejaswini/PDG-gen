import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int N = sc.nextInt(), L = sc.nextInt();
		//String[] array = new String[N];
		String s=sc.next(),t=sc.next(),buff="";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			s=s.substring(s.length()-1,s.length())+s.substring(0, s.length()-1);
			if(t.equals(s)) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		/*if(Integer.parseInt(s)%sum==0) {
			System.out.println("Yes");//Yes or YES注意
		}else {
			System.out.println("No");
		}*/

		System.out.println("No");

	}
	public static int sample(int n) {
		return n;
	}

}
