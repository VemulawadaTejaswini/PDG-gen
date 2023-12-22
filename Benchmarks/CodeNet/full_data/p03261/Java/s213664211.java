import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String str[]=new String[a];
		for(int i=0;i!=a;i++) {
			str[i]=scan.next();
		}
		String ans="";
		int count=0;
		for(int i=0;i!=a;i++) {
			for(int j=0;j!=i;j++) {
				if(str[i].equals(str[j])) {
					count=1;
				}
			}
			if(i==a-1) {
				break;
			}
			if(str[i].charAt(str[i].length()-1)==str[i+1].charAt(0)) {
				
			}
			else {
				count=1;
			}
		}
		if(count==1) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		}
}