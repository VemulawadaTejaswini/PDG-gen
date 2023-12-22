import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		int count =0;
		int flag=0;
		int s=0;
		int l=0;//hazimeno文字がAならflag==1
		char check=' ';
		String subStr="";
		for(int k =0;k<q;k++) {
			 s = sc.nextInt();
			 l = sc.nextInt();
			  subStr = str.substring(s-1,l);
			for(int m = 0; m<subStr.length();m++) {
				check = subStr.charAt(m);
				if(check=='A') {
				flag=1;
				}else if(flag==1 && check=='C'){
					count++;
					flag=0;
				}
			}
			System.out.println(count);
			count=0;
		}

	}
}