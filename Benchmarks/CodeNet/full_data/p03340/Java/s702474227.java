import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int len;
		int line[];
		int count = 0;
		int temp,tempxor;
		Scanner scan = new Scanner(System.in);

		len = scan.nextInt();
		line = new int[len];

		for(int i = 0;i < len;i++) {
			line[i] = scan.nextInt();
		}

		for(int i = 0;i < len;i++) {
			tempxor = temp = line[i];
			count++;
			for(int j = i + 1;j < len;j++) {
				temp += line[j];
				tempxor ^= line[j];
				if(temp == tempxor) count++;
			}
		}

		System.out.println(count);
        scan.close();


	}

}
