import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		long target = cin.nextLong();
		long tmp = 0L;

		for(long i =0L;i<=target;i++){
			if(i*(i+1)>=2*target){
				tmp =i;
				break;
			}
		}
		System.out.println(tmp);
	}
}
