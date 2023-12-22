import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();

	int num = 0;
	int tmp = N;
	while(tmp > 0){
	    num += tmp % 10;
	    tmp /= 10;
	}

	if(N % num == 0){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
