import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//System.out.println(N);
		int m=0;
		int a=0;
		int r=0;
		int c=0;
		int h=0;
		for(int i =0;i<N;i++){
			String str=sc.next();
			//System.out.println(str);
			char hoge =str.charAt(0);
			//System.out.println(hoge);
			if(hoge == 'M'){
				//System.out.println("M");
				m++;
			}else if(hoge=='A'){
				a++;
				//System.out.println("A");
			}else if(hoge=='R'){
				r++;
				//System.out.println("R");
			}else if(hoge=='C'){
				c++;
				//System.out.println("C");
			}else if(hoge=='H'){
				h++;
				//System.out.println("H");
			}
		}
		long ans=0;
		ans = m*(a*(r+c+h)+r*(c+h)+c*h)+a*(r*(c+h)+c*h)+r*c*h;
		System.out.println(ans);
		sc.close();
	}
}
