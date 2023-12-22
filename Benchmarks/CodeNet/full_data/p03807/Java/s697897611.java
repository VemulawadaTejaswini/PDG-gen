import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int one=0;
		for(int i = 0; i<n; i++){
			long a = sc.nextLong();
			if(a%2==1){
				one++;
			}
		}
		if(one%2==0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
