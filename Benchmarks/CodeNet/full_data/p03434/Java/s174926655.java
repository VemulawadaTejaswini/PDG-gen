import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();

	Integer[] a_ = new Integer[N];
	for(int i = 0; i < N; i++){
	    a_[i] = scan.nextInt();
	}

	Arrays.sort(a_, Comparator.reverseOrder());

	int point = 0;
	for(int i = 0; i < N; i++){
	    if(i % 2 == 0){
		point += a_[i];
	    }else{
		point -= a_[i];
	    }
	}

	System.out.println(point);
    }
}
