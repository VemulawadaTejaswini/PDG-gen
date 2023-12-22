import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		StringBuilder buff = new StringBuilder();
		String voi="";
		for(int i=0; i<x2-x1; i++) {
			buff.append("R");
		}
		for(int i=0; i<y2-y1; i++) {
			buff.append("U");
		}
		for(int i=0; i<x2-x1; i++) {
			buff.append("L");
		}
		for(int i=0; i<y2-y1+1; i++) {
			buff.append("D");
		}
		for(int i=0; i<x2-x1+1; i++) {
			buff.append("R");
		}
		for(int i=0; i<y2-y1+1; i++) {
			buff.append("U");
		}
		buff.append("LU");
		for(int i=0; i<x2-x1+1; i++) {
			buff.append("L");
		}
		for(int i=0; i<y2-y1+1; i++) {
			buff.append("D");
		}
		buff.append("R");
		System.out.println(buff.toString());
	}
}