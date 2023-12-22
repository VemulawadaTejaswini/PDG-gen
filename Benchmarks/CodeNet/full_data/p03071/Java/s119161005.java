import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int q = scan.nextInt();
		int ans=0;
		for(int i=0;i<2;i++){
			if(p>q){
				ans+=p;
				p--;
			}else{
				ans+=q;
				q--;
			}
		}
		System.out.println(ans);
	}
}