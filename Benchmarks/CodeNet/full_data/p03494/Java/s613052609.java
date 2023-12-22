import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int number = sc.nextInt();
			list.add(number);
		}
		
		int counter = 0;
		boolean listHasOdd = false;
		while(!listHasOdd) {
			for(int number: list) {
				if(!(number % 2 == 0)) {
					System.out.println(counter);
					return;
				}
			}
			for(int i = 0; i < list.size(); i++) {
				int number = list.get(i);
				list.set(i, number / 2);
				counter++;
			}
			
		}

		}

		
	}


