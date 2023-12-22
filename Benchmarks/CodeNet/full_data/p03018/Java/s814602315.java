
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char[] str = sc.next().toCharArray();

		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

		for(int i = 0; i < str.length - 2; i++){
			if(str[i] == 'A' && str[i + 1] == 'B' && str[i + 2] == 'C'){
				queue.add(i);
			}
		}

		int count = 0;

		while(!queue.isEmpty()){
			int index = queue.removeFirst();

			str[index] = 'B';
			str[index + 1] = 'C';
			str[index + 2] = 'A';

			count++;

			if(index > 0 && str[index - 1] == 'A'){
				queue.add(index - 1);
			}
			if(index + 4 < str.length && str[index + 3] == 'B' && str[index + 4] == 'C'){
				queue.add(index + 2);
			}
		}

		System.out.println(count);
	}
}