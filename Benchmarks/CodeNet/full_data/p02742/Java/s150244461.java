import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long H = sc.nextLong();
	long W = sc.nextLong();
	long count=0;
	if(H%2==0){
	    count = H/2 * W;
	}else if(H%2==1){
	    count = H * (W/2);
	    if(W%2==1){
	    	count += H/2 +1;
	    }
	}
	System.out.print(count);
    }
}
