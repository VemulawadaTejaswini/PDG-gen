import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			long a = scan.nextInt();
			long b = scan.nextInt();
			long temp,max;
			long[] arr = new long[100000];
			arr[0] = 1;
			if (a > b){
				temp = b;
				max=a;
			}
			else{
				temp = a;
				max=b;
			}
			int flag = 1;
			while (temp % 2 == 0) {
				flag = 0;
				temp /= 2;
				arr[1] = 2;
			}
			int sum = 1;
			int j;
			if (flag == 1)
				j = 1;
			else {
				j = 2;
				sum++;
			}

			for (int i = 3; i <= temp;) {
				if (temp % i == 0) {
					arr[j++] = i;
					temp /= i;
					sum++;
				} else
					i += 2;
			}
			int sum2=0;
			for(int i=0;i<sum;i++){
				if(max%arr[i]==0)
					sum2++;
			}
			System.out.println(sum2);
		}
	}
}
