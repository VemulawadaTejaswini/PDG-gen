import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		int A = cin.nextInt();
		int B = cin.nextInt();
		int C = cin.nextInt();
		int a,b,c;
		int count = 0;
		int limit = (int)Math.pow(10, 8);

		for(int i=0;i<limit;i++){
			if(A%2==0&&B%2==0&&C%2==0){
				a=B/2+C/2;
				b=A/2+C/2;
				c=A/2+B/2;
				A=a;
				B=b;
				C=c;
				count++;
			}else{
				break;
			}
		}

		if(count<limit){
			System.out.println(count);
		}else{
			System.out.println("-1");
		}

	}
}
