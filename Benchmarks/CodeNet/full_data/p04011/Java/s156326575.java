import java.util.*;

public class Main {
    public static void main(String[] args){
	int N,K,X,Y;

	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	K = sc.nextInt();
	X = sc.nextInt();
	Y = sc.nextInt();

	int sum = 0;

	if(N>K){
	    sum =K*X +(N -K)*Y;
	}else{
	    sum = N*X;
	}

	System.out.println(sum);
    }
}
