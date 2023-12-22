import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		String voi="";
		for(int i=0; i<x2-x1; i++) {
			voi=voi+"R";
		}
		for(int i=0; i<y2-y1; i++) {
			voi=voi+"U";
		}
		for(int i=0; i<x2-x1; i++) {
			voi=voi+"L";
		}
		for(int i=0; i<y2-y1+1; i++) {
			voi=voi+"D";
		}
		for(int i=0; i<x2-x1+1; i++) {
			voi=voi+"R";
		}
		for(int i=0; i<y2-y1; i++) {
			voi=voi+"U";
		}
		voi=voi+"LU";
		for(int i=0; i<x2-x1+1; i++) {
			voi=voi+"L";
		}
		for(int i=0; i<y2-y1+1; i++) {
			voi=voi+"D";
		}
		voi=voi+"R";
		System.out.println(voi);
	}
}