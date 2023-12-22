import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		long M = scan.nextLong();

		int count = 0;
		int numone=0;
		while(count < N.length()){
			String first = N.substring(count,count+1);
			if(first.equals("1")){
				numone++;
			}else{
				break;
			}
			
			count++;
		}
		
		if(M <= numone){
			System.out.println("1");
		}	
		else{
			System.out.println(N.substring(count,count+1));
		}




	}



}