import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int total = a*x + b*y;
		for(int i=0; i<=x; i++){
			for(int j=0; j<=y; j++){
				int k = (Math.max(x-i,y-j))*2;
				if(a*i + b*j + c*k < total)total = a*i + b*j + c*k;
			}
        }
		System.out.println(total);
	}
}