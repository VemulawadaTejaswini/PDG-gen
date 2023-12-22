import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		String S=stdIn.next();
		String a="";
		char b=' ';
		b=S.charAt(K-1);
		if(b=='A')
			b='a';
		if(b=='B')
			b='b';
		if(b=='C')
			b='c';
		a=S.substring(0,K-1)+b+S.substring(K,N);
		System.out.println(a);
	}
}