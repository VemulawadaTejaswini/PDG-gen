import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int cnt = 0;
		if((A%2 + B%2 + C%2)==1){
				if(A%2!=0){
					B++;
					C++;
				}
				else if(B%2!=0){
					A++;
					C++;
				}
				else if(C%2!=0){
					A++;
					B++;
				}
				cnt++;
		}
		if((A%2 + B%2 + C%2)==2){
				if(A%2!=1){
					B++;
					C++;
				}
				else if(B%2!=1){
					A++;
					C++;
				}
				else if(C%2!=1){
					A++;
					B++;
				}
				cnt++;
		}

		int maxval=A;

		if(maxval<B) maxval = B;
		if(maxval<C) maxval = C;

		System.out.println((maxval-A)/2+(maxval-B)/2+(maxval-C)/2+cnt);	
		
	}

}