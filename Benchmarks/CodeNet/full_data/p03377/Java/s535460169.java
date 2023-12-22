import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(),B=sc.nextInt(),X=sc.nextInt();
		String ans;
		if(X-A<B && X-A>0){
			ans="YES";
		}else{
			ans="NO";
		}
		System.out.println(ans);
	}
}