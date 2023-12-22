import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kk=sc.nextInt();
		for(int vvk=0; vvk<kk; vvk++) {
			long a=sc.nextLong();
			long b=sc.nextLong();
			long c=sc.nextLong();
			long d=sc.nextLong();
			long tmp=0;

			if(b>d) {
				System.out.println("No");
			}
			else if(b<=d) {
				tmp=a;
				for(int i=0; i<114514; i++) {
					if((tmp-b+d)%b>c || tmp<b) {
						System.out.println("No");
						break;
					}tmp=(tmp-b+d)%b+d;

					if(i==114513 &&((tmp-b+d)%b<=c || tmp>=b)) {
						System.out.println("Yes");
						break;
					}
				}
			}
		}
	}
}