import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char[][] s=new char[100][40];
		for(int i = 0; i<50; i++){
			Arrays.fill(s[i],'#');
		}
		for(int i = 50; i<100; i++){
			Arrays.fill(s[i],'.');
		}
		for(int i = 0; i<a; i++){
			s[(i/50)*2][(i%50*2)]='.';
		}
		for(int i = 0; i<b; i++){
			s[99-(i/50)*2][(i%50)*2]='#';
		}
		System.out.println(100+" "+40);
		for(int i = 0; i<100; i++){
			for(int j = 0; j<40; j++){
				System.out.print(s[i][j]);
			}	
			System.out.println();
		}
	}
}
