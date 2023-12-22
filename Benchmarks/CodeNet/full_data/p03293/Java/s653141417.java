import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a=sc.next().toCharArray();
		char[] b=sc.next().toCharArray();
		int l=a.length;
		for(int i=0;i<l;i++){
			if(Arrays.equals(a,b)){
				System.out.println("Yes");
				return;
			}else{
				rotate(b);
			}
		}
		System.out.println("No");
	}
	
	static void rotate(char[] b){
		char c0=b[0];
		for(int i=0;i<b.length-1;i++){
			b[i]=b[i+1];
		}
		b[b.length-1]=c0;
	}
}
