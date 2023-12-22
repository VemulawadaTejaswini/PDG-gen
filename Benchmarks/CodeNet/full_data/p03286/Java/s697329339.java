import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String st="";

		if(N==0){
			System.out.println(0);
		}else{

			while(N!=0){
				if(Math.abs(N)%2==1){
					st += "1";
					N--;
				}else{
					st += "0";
				}

				N /= -2;
			}

			StringBuffer sb = new StringBuffer(st);
			System.out.println(sb.reverse().toString());
		}

	}
}