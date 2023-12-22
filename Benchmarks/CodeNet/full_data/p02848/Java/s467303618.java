import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		List<String> alphabetList = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
		int n = sc.nextInt();
		String[] inputArray = sc.next().split("");
		StringBuilder answer = new StringBuilder();
		int index =0;
		for(int i= 0;i < inputArray.length;i++) {
			index =  alphabetList.indexOf(inputArray[i]);
			index += n;
			if(index >=26) {
				index -= 26;
			}
			answer.append(alphabetList.get(index));
		}

		System.out.println(answer);

	}
}
