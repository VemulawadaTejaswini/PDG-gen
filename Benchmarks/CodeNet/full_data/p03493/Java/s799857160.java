import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String ary[]=s.split("");
		int cnt=0;
		
		for(int i=0; i<ary.length; i++) {
			if(ary[i].equals("1")) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
