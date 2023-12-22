import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int len;
		int line[];
		int count = 0;
		int tempcount = 0;
		int temp,tempxor;
		Scanner scan = new Scanner(System.in);

		len = scan.nextInt();
		line = new int[len];

		for(int i = 0;i < len;i++) {
			line[i] = scan.nextInt();
		}

		int i = 0,j = 0;
		temp = tempxor = line[i];
		tempcount++;

		while(true){
			j++;
			if(j == len) {
				count += calcCombi(tempcount);
				break;
			}

			temp += line[j];
			tempxor ^= line[j];

			if(temp == tempxor) {
				tempcount++;
			}
			else {
				count += calcCombi(tempcount);
				tempcount++;

				while(true) {
					tempcount--;
					temp -= line[i];
					tempxor ^= line[i];
					i++;

					if(temp == tempxor) {
						count -= calcCombi(j-i);
						break;
					}
				}
			}
		}

		System.out.println(count);

		scan.close();
	}

	public static int calcCombi(int n) {
		return  n + n * (n - 1) / 2;
	}

}