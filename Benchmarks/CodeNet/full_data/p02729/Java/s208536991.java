import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String input_line[] = sc.nextLine().split(" ");
        int N=Integer.parseInt(input_line[0]);
        int M=Integer.parseInt(input_line[1]);
        int sum=0;
        sum=N*(N-1)/2+M*(M-1)/2;
        System.out.print(sum);
	}

}