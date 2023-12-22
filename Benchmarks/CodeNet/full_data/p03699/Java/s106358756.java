import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
import java.util.FormatFlagsConversionMismatchException;

public class Main {

    public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	int N = Integer.parseInt(scan.next());
    	Integer[] score = new Integer[N];

    	int sum = 0;
    	int flag = 0;

    	for(int cnt = 0; cnt < N ; cnt++ ){
    		score[cnt] = Integer.parseInt(scan.next());
    		sum = sum + score[cnt];
    	}

    	// 10で割り切れるならば、
    	if(sum % 10 == 0){
    		Arrays.sort(score, Comparator.reverseOrder());
    		for(int cnt = N-1; cnt >= 0; cnt--){
    			sum = sum - score[cnt];
    			if(sum % 10 != 0){
    				break;
    			}
    		}
    		System.out.println(sum);
    	}
    	else{
    		System.out.println(sum);
    	}
    }
}