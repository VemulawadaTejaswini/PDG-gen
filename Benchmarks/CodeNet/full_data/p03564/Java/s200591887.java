import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),k=stdIn.nextInt(),s=1,i;
		for(i=0;i<n;i++) {
			if(s*2>s+k) s+=k;
			else s*=2;
		}
		System.out.print(s);
	}
}