import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();

	for(int i=100;i>1;i--){
	    if((N / Math.pow(K,i)) >= 1){
		System.out.print(i+1);
		break;
	    }
	}
    }
}
