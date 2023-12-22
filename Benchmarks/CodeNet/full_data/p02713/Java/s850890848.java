import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y=0;
		for(int i=1;i<=x;i++){
			for(int j=1;j<=x;j++){
				for(int k=1;k<=x;k++){
					int a=i;
					if(a<j) {
						a=j;
					}
					if(a<k) {
						a=k;
					}
					while(a>=1) {
						if(i%a==0&&j%a==0&&k%a==0) {
							y+=a;
							break;
						}
						a--;
					}

				}				
			}			
		}
			System.out.print(y);

		

	}
}