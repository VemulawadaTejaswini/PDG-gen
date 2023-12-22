import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long tk=sc.nextLong();
		long ao=sc.nextLong();
		int kaisu=sc.nextInt();

		int cnt=1;
		for(int i=0; i<kaisu; i++) {
			if(cnt==1) {
				if(tk%2==0) {
					ao+=tk/2;
					tk/=2;
				}
				else if(tk%2==1) {
					tk--;
					ao+=tk/2;
					tk/=2;

				}
				cnt*=-1;
			}
			else if(cnt==-1) {
				if(ao%2==0) {
					tk+=ao/2;
					ao/=2;
				}
				else if(ao%2==1) {
					ao--;
					tk+=ao/2;
					ao/=2;
				}
				cnt*=-1;
			}
		}
		System.out.println(Math.max(0, tk)+" "+Math.max(0, ao));
	}
}