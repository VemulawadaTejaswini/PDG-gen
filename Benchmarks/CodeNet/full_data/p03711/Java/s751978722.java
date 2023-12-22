import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt(),y=stdIn.nextInt(),a=0,b=0;
		if(x==4||x==6||x==9||x==11) a++;
		else if(x==2) a+=2;
		if(y==4||y==6||y==9||y==11) b++;
		else if(y==2) b+=2;
		System.out.print(a==b?"Yes":"No");
	}
}