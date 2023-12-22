import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int L = scan.nextInt();

	String[] s_ = new String[N];
	for(int i = 0; i < N; i++){
	    s_[i] = scan.next();
	}

	Arrays.sort(s_);

	for(int i = 0; i < N; i++){
	    System.out.print(s_[i]);
	}
	System.out.println();
    }
}
	
