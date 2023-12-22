import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int ans=0;
		int mem=0;
		for(int i=0;i<p;i++){
			int q = scan.nextInt();
			if(mem<=q){
				ans++;
				mem=q;
			}
		}
		System.out.println(ans);
	}
}