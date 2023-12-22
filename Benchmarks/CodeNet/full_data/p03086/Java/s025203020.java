import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String s = scanner.next();

		List<Character> list = new ArrayList<>();
		list.add('A');
		list.add('C');
		list.add('G');
		list.add('T');

		List<Character> result = new ArrayList<>();

		boolean finded = false;

		for(int i = 0; i < 10; i++){
			if(s.isEmpty())
				break;
			char first = s.charAt(0);
			if(list.contains(first)){
				result.add(first);
				finded = true;
			}else{
				if(finded)
					break;
			}
			s = s.substring(1);
		}

		System.out.println(result.size());
	}
}
