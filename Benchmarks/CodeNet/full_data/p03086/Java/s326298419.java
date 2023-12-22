import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		int ans=0;
		for(int i=0;i<a.length();i++) {
			for(int j=i+1;j<a.length();j++) {
				String str=a.substring(i,j);
				int count=0;
				for(int k=0;k<str.length();k++) {
					char ch=str.charAt(k);
					if(ch=='A'||ch=='C'||ch=='G'||ch=='T') {
						count++;
					}
					else {
						break;
					}
				}
				ans=Math.max(ans,count);
			}
		}
		System.out.println(ans);
	}
	}
