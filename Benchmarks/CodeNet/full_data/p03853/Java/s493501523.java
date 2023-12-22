import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String c[]=new String[100];
		int h=stdIn.nextInt(),w=stdIn.nextInt(),i,j;
		for(i=0;i<h;i++) c[i]=stdIn.next();
		for(i=0;i<h;i++) for(j=0;j<2;j++) System.out.println(c[i]);
	}
}