import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in); 
		int n = Integer.parseInt(as.next());
		int a = n;
		for(int i=0;i<n;i++){
			int c=0;
			int t=i;
			while(t>0){
				c += t%6;
				t /= 6;
			}
			t = n-i;
			while(t>0){
				c += t%9;
				t /= 9;
			}
			if(a>c){
				a = c;
			}
		}
		System.out.println(a);
	}
}