import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String S=sc.next();
		int ans=0,temp=0;
		boolean f=false;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='A'||S.charAt(i)=='C'||S.charAt(i)!='G'||S.charAt(i)!='T') {
				temp++;
				f=true;
			}else {
				ans=Math.max(temp, ans);
				temp=0;
			}
		}
		System.out.println(f?ans:temp);
	}
}