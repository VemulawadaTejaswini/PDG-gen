import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		String C=sc.next();
		int[] stats=new int[3];
		char next='a';
		int[] max=new int[3];
		max[0]=A.length();
		max[1]=B.length();
		max[2]=C.length();
		for(int i=0; i<3; i++) {
			stats[i]=0;
		}
		next=A.charAt(0);
		stats[0]++;
		while(true) {
			char old=next;
			if(next=='a') {
				if(stats[0]<max[0]) {
					next=A.charAt(stats[0]);
					stats[0]++;
				}
				else {
					System.out.println("A");
					System.exit(0);
				}
			}
			else if(next=='b') {
				if(stats[1]<max[1]) {
					next=B.charAt(stats[1]);
					stats[1]++;
				}
				else {
					System.out.println("B");
					System.exit(0);
				}
			}
			else if(next=='c') {
				if(stats[2]<max[2]) {
					next=C.charAt(stats[2]);
					stats[2]++;
				}
				else {
					System.out.println("C");
					System.exit(0);
				}
			}
		}
	}
}