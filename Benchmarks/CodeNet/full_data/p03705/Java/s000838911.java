import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int count = cin.nextInt();
		int min = cin.nextInt();
		int max = cin.nextInt();
		cin.close();
		long result;


		if(count==1){
			if(min==max){
				result=1;
			}else{
				result=0;
			}
		}else{
			if(min>max){
				result=0;
			}else if(min<max){
				result=(max*(count-1)+min)-(max+min*(count-1))+1;
			}else{
				result=min*count;
			}
		}

		System.out.println(result);
	}
}
