import java.util.Scanner;

public class Main {
	static Scanner sc;
	
	

	public static void main(String[] args) {
		
		String x;
		sc = new Scanner(System.in);
		

		x = sc.next();
		int n = x.length();
		char[] X = x.toCharArray();
		int len= n;
		
		for(int i=0; i<n-1; i++){
			if(X[i]=='S' && X[i+1]=='T'){
				len-=2;
				int j=i;
				
				while(j-1>=0 && X[j-1]=='S'){
					if(X[i+2]=='T'){
						i++;
						j--;
						len-=2;
					} else {
						break;
					}
				}

			}
		}
		
		System.out.println(len);

	}

}
