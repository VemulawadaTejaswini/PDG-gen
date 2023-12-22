import java.util.Scanner;public class Main{public static void main(String[]args){Scanner scan=new Scanner(System.in);
		//String str=scan.next();
		String a=scan.next();
		int count=0;
		for(int i=0;i<a.length()-1;i++) {
			char ch1=a.charAt(i);
			char ch2=a.charAt(i+1);
			int k=a.length();
			if(ch1=='1'&&ch2=='0'||ch1=='0'&&ch2=='1') {
				count+=2;
				String str="";
				for(int j=0;j<k;j++) {
					char ch=a.charAt(j);
					if(j==i||j==i+1) {
						continue;
					}
					str+=String.valueOf(ch);
				}
				i=-1;
				a=str;
			}
		}
		System.out.println(count);
	}
}