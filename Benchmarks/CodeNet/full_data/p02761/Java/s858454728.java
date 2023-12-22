import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m = sc.nextInt();
		int min = 0;
		for(int i=0;i<m;i++){
			int s=sc.nextInt();
			int c=sc.nextInt();
			if(c==0&&s==1){
				System.out.println(-1);
				System.exit(0);
			}else if(n-s>=0&&min/(int)Math.pow(10,n-s)!=c){
				min += c * (int)Math.pow(10,n-s);
			}
		}
		
		if(n-1>min/10){
			min += (int)Math.pow(10,n-1);
			System.out.println(min);
		}else if(n-1==min/10){
			System.out.println(min);
		}else{
			System.out.println(-1);
		}
	}
}
