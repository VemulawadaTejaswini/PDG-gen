import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//入力を配列化
		char[] array = scanner.next().toCharArray();

		//かぶった数
		int count = 0;

		for(int i = 0; i < array.length; i++) {
          
			for(int l = 0; l < array.length; l++) {
              
				//同じ要素を比較しない
				if(i == l) {
					continue;
				}
              
				count += array[i] == array[l] ? 1 : 0;
              
			}
          
		}
		
		System.out.println(count == 4 ? "Yes" : "No");

		scanner.close();
	}

}
