import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int target = cin.nextInt();
		cin.close();
		long count = 0;
		long div = (long)Math.pow(10,9)+7;

		for(int i=1;i*i<target;i++){
			if(target%i==0){
				count++;
			}
		}

		System.out.println(count%div);
	}
}
