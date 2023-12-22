import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		atcode();
	}

	public static void atcode() {
		Scanner sc=new Scanner(System.in);
		List<Integer> input=new ArrayList<Integer>();
		while(sc.hasNextLine()) {
			input.add(Integer.valueOf(sc.nextLine()));
		}
		int X=input.get(3);
		Integer count=0;
		for(int a=input.get(0);a>=0;a--) {
			for(int b=input.get(1);b>=0;b--) {
				for(int c=input.get(2);c>=0;c--) {
					Integer price=500*a+100*b+50*c;
					if(price==X){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}