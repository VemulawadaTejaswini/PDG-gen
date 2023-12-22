import java.util.Scanner;
class Main{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		String str=sc.next();
		String ans[]=new String[a];
		int countJ=0;
		int countF=0;
		for(int i=0;i<a;i++) {
			char ch=str.charAt(i);
			if(ch=='c') {
				ans[i]="No";
			}
			if(ch=='a') {
				if(countJ+countF<b+c) {
					countJ++;
					ans[i]="Yes";
				}
				else {
					ans[i]="No";
				}
			}
			if(ch=='b') {
				if(countJ+countF<b+c) {
					if(countF<c) {
						countF++;
						ans[i]="Yes";
					}
					else {
						ans[i]="No";
					}
				}
				else {
					ans[i]="No";
				}
			}
		}
		for(int i=0;i<a;i++) {
			System.out.println(ans[i]);
		}
	}
}