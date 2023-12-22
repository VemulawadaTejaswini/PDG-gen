import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum = 457992974;
		int all = 1;
		for(int i=1;i<=n;i++){
			all*=i;
			if(all>sum){
				all = sum;
				break;
			}
		}
		System.out.print(all);
	}
}
