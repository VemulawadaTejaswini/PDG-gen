import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,a,b;
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		String s = "";
		while(sc.hasNext()) s += sc.next();
		sc.close();

		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='c'){
				System.out.println("No");
				continue;
			}
			if(s.charAt(i)=='a'&&(a+b)>0){
				System.out.println("Yes");
				a--;
				continue;
			}
			if(s.charAt(i)=='b'&&b>0){
				System.out.println("Yes");
				b--;
				continue;
			}
		}

	}

}