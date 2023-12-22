import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> inputList = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
        	inputList.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(inputList);

		if (inputList.get(0) != 5) {
			System.out.println("NO");
			return;
		}

		if (inputList.get(1) != 5) {
			System.out.println("NO");
			return;
		}

		if (inputList.get(2) != 7) {
			System.out.println("NO");
			return;
		}


		System.out.println("Yes");

	}
}