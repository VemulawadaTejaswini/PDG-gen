import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	long N = scan.nextLong();
	long[] route_ = new long[5];
	for(int i = 0; i < 5; i++){
	    route_[i] = scan.nextLong();
	}

	long min = Math.min(
			    Math.min(
				     Math.min(route_[0],route_[1]),
				     Math.min(route_[2],route_[3])),
			    route_[4]);

	long count = (long)5;
	if(N % min != (long)0){
	    count += N / min;
	}else{
	    count += (N / min - 1);
	}

	System.out.println(count);
    }
}
