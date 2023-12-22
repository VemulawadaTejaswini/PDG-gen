import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int counter = 0;
		for(int i = 0; i < num; i++){
			numList.add(scan.nextInt());
		}
		for(int i = 0; i < num; i++){
			int temp = 0;
			int A = numList.get(i);
			if(i == 0){
				counter += A / 2;
			}else{
				temp = numList.get(i - 1);
				if(temp % 2 == 0){
					counter += A / 2;
				}else{
					counter += (A + 1) / 2;
				}
			}
		}
		System.out.println(counter);
	}
}