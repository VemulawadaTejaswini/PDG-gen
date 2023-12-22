import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s2 = s.replace("BC", "D");
		char[] c = s2.toCharArray();
		int i;
		int count=0;
		for(i=0;i<c.length-1;i++) {
			if(c[i]=='A'&&c[i+1]=='D') {
				//swap
				c[i]='D';
				c[i+1]='A';
				count++;
				//i=0
				if(i==0){
				}
				else if(c[i-1]=='A') {
					i=i-2;
				}
			}
		}
		System.out.println(count);
	}

}
