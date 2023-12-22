import java.util.*;
import java.text.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int a = 0;

		for(int i = 1; i <= num; i++){
			a = i%2;
			if(a == 1){
				count+=1;
			}
		}
		double prob = (double)count/num;
		System.out.println(prob);

	}
}