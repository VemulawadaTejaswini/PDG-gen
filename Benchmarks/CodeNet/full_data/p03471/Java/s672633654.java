import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long s = sc.nextLong();
		for(int i = 0; i<=k; i++){
			for(int j =0; j<=k; j++){
				if(s-1000*i-5000*j==10000*(k-i-j)){
					System.out.println(k-i-j+" "+j+" "+i);
					return;
				}
			}
		}
		System.out.println(-1+" "+-1+" "+-1);
	}
}