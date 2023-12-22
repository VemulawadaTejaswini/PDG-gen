import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = Integer.parseInt(as.next());
		int a = Integer.parseInt(as.next());
		int b = Integer.parseInt(as.next());
		if(n%(a+b)<=a){
			System.out.println(n/(a+b)*a+n%(a+b));
		}else{
			System.out.println(n/(a+b)*a+a);
		}
	}
}