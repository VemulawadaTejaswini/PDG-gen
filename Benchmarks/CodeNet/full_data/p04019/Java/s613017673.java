


import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] vc=new int[4];
		String a=sc.next();

		for(int i=0; i<4; i++) {
			vc[i]=0;
		}
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='N') {
				vc[0]++;
			}
			else if(a.charAt(i)=='W') {
				vc[1]++;
			}
			else if(a.charAt(i)=='S') {
				vc[2]++;
			}
			else if(a.charAt(i)=='E') {
				vc[3]++;
			}
		}

		int zc=0;
		for(int i=0; i<4; i++) {
			if(vc[i]==0) {
				zc++;
			}
		}
		if(zc%2==1) {
			System.out.println("No");
		}
		else {
			if(vc[0]*vc[2]>0 || (vc[0]==0 && vc[2]==0)) {
				if(vc[1]*vc[3]>0 || (vc[1]==0 && vc[3]==0)) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
			else {
				System.out.println("No");
			}
		}
	}
}