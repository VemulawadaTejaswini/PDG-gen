import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class A {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int a= in.nextInt()*10;
		int b= in.nextInt();
		if((a+b)%4==0){
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}
}
