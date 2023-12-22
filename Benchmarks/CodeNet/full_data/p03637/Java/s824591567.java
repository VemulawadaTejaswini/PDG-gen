import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int plus=0;
		for(int i = 0; i<n; i++){
			long a = sc.nextLong();
			if(a%4==0){
				count++;
			}
		}
		if(n%3!=0){
			plus=1;
		}
		if(count>=(n/3)+plus){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}