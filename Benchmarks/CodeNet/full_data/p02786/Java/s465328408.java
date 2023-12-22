import java.util.Scanner;

public class Caracal_vs_Monster {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		long H = sc.nextInt();
		long count = 0;
		long j = 0;
		while(H > 0) {
			H /= 2;
			count+= Math.pow(2, j);
			j++;
		}
		System.out.println(count);
	}

}