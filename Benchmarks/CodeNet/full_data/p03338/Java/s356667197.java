import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//, n = sc.nextInt();
		int sum=0,count=0,flag=0,max=-999999,min=99999;
		//String[] array = new String[n];
		String s=sc.next();//,t=sc.next();
		String buff1,buff2;

		for(int i=0;i<s.length()-1;i++) {
			buff1=s.substring(0,i+1);
			buff2=s.substring(i+1,s.length());
			//System.out.println(buff1+" "+buff2);
			for(int j=0;j<buff1.length();j++) {
				for(int l=0;l<j;l++) {
					if(buff1.charAt(j)==buff1.charAt(l)) {
						flag=1;
						//System.out.println("same");
					}
				}
				if(flag==1) {
					flag=0;
					continue;
				}
				flag=0;
				for(int k=0;k<buff2.length();k++) {
					if(buff1.charAt(j)==buff2.charAt(k)) {
						count++;
						break;
					}
				}
			}
			//System.out.println(count);
			max=Math.max(count, max);
			count=0;
		}

		System.out.println(max);

	}
	public static int sample(int n) {
		return n;
	}

}
