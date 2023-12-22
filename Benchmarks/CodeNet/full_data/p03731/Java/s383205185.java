import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextLong();
		long ans=0;
		long dif=0;
		for(int i = 0; i < n; i++){
			long a = sc.nextLong();
			if(i==0){
				dif=a;
			}else{
				if(a-dif<t){
					ans+=a-dif;
				}else{
					ans+=t;
				}
			}
			dif=a;
		}
		System.out.println(ans+t);
	}
}