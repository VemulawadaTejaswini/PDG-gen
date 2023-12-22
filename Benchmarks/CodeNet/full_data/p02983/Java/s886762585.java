import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
        int D = input.nextInt();
        long remain = (long)(2 * Math.pow(10,9)) * 2;
        for (long i = N; i < D; i++) {
            for (long j = i + 1; j <= D; j++) {
                if((i*j)%2019 < remain)
                    remain = (i*j)%2019;
                if(remain == 0)
                    break;
            }
            if(remain == 0)
                break;
        }
		System.out.println(remain);
	}
}